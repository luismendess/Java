package clientegrupo1;

import java.net.*;

public class ClienteGrupo1 {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 2525);
        ChatGUI client = new ChatGUI(socket);
        client.setVisible(true);
    }
}
