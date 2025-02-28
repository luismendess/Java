package servidorgrupo1;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorGUI extends JFrame {
    private JTextPane chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private PrintStream out;
    private BufferedReader in;
    private Socket socket;
    private Thread readThread;

    @SuppressWarnings("resource")
    public ServidorGUI(Socket socket) throws IOException {
        this.socket = socket;
        setTitle("Chat Servidor");
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chatArea = new JTextPane();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 14));
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 14));
        sendButton = new JButton("Enviar");
        sendButton.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);
        add(panel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();
        in = new BufferedReader(new InputStreamReader(input));
        out = new PrintStream(output);

        readThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        appendToPane(chatArea, "Cliente: ", Color.BLUE, true);
                        appendToPane(chatArea, message + "\n", Color.BLACK, false);
                    }
                } catch (IOException e) {
                    if (!socket.isClosed()) {
                        e.printStackTrace();
                    }
                }
            }
        });
        readThread.start();
    }

    private void sendMessage() {
        String message = inputField.getText();
        out.println(message);
        appendToPane(chatArea, "Servidor: ", Color.RED, true);
        appendToPane(chatArea, message + "\n", Color.BLACK, false);
        inputField.setText("");
        if ("FIM".equals(message)) {
            try {
                socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            System.exit(0);
        }
    }

    private void appendToPane(JTextPane tp, String msg, Color c, boolean bold) {
        StyledDocument doc = tp.getStyledDocument();
        Style style = tp.addStyle("Style", null);
        StyleConstants.setForeground(style, c);
        StyleConstants.setBold(style, bold);
        try {
            doc.insertString(doc.getLength(), msg, style);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(2525)) {
            System.out.println("Aguardando Conexão");
            try (Socket socket = serverSocket.accept()) {
                System.out.println("Conexão Estabelecida");
                ServidorGUI server = new ServidorGUI(socket);
                server.setVisible(true);
            }
        }
    }
}
