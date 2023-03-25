/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientegrupo1;

import java.net.*;
//Provê classes de suporte a rede (Socket e ServerSocket)
import java.io.*;
//É um pacote java que possui classes para Entrada e Saída (BufferedReader e DataOutPutStream)
import java.util.Scanner;


/**
 *
 * @author matheus
 */
public class ClienteGrupo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        System.out.println("Iniciando cliente");
        
        System.out.println("Iniciando conxexão com o servidor");
        
        Socket socket = new Socket("localhost",2525);
        //socket para estabelecer uma conexão c/ servidor
        //local host pode ser substituído pelo IP: "192.168.0.100"
        
        System.out.println("Conexão Estabelecida");
        // com objeto Socket é possível enviar dados para o servidor
        
        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();
        //InputStream do cliente está conectado ao OutputStream do servidor. E Vice versa
        
        BufferedReader in = new BufferedReader(new InputStreamReader(input));
        //ler bytes (string) em um BufferedReader
        
        PrintStream out = new PrintStream(output);
        //objetos para gravar e ler mensagens do servidor
        //vai perceber uma sintaxe semelhante no servidor
        
        //Lógica do programa: ler e enviar uma mensagem ao servidor
        // se digitar FIM encerra o servidor.
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Digite uma Mensagem");
            String mensagem = scanner.nextLine();
            
            out.println(mensagem);
            //envia mensagem para servidor
            
            if ("FIM".equals(mensagem)){
                break;
            }
            //senão aguardar resposta do servidor
            mensagem = in.readLine();
            
            System.out.println("Mensagem recebida do servidor: "+mensagem);
            //imprime mensagem recebida do servidor
        }
        
        System.out.println("Encerrando Conexão");
        //encerrar o laço
        
        in.close();
        
        out.close();
        //encerrando OutputStream
        
        socket.close();
        //fechando socket
                
    }
    
}
