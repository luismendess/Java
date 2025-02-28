package servidorgrupo1;

import java.net.*;

public class ServidorGrupo1 {

    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(2525)) {
            System.out.println("Aguardando Conexão");
            Socket socket = serverSocket.accept();
            System.out.println("Conexão Estabelecida");
            ServidorGUI server = new ServidorGUI(socket);
            server.setVisible(true);
        }
    }
}
