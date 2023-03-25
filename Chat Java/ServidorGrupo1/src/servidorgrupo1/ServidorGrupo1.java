/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorgrupo1;

import java.net.*;
//Provê classes de suporte a rede (Socket e ServerSocket)
import java.io.*;
//É um pacote java que possui classes para Entrada e Saída (BufferedReader e DataOutPutStream)

/**
 *
 * @author matheus
 */
public class ServidorGrupo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //throws Exception - Exceções e controle de erros
        
        System.out.println("Iniciando o Servidor");
        
        ServerSocket server = new ServerSocket(2525);
        System.out.println("Aguardando Conexão");
        //Cria o objeto server com o tipo ServerSocket
	//O server é um processo que fica "ouvindo" na porta especificada, 
	//esperando uma conexão
        //nesse ponto é necessário fazer o import java.net.*;
        
        Socket socket = server.accept();
        //Cria um novo socket quando algum cliente bater em server
        
        System.out.println("Conexão Estabelecida");
        
        InputStream input = socket.getInputStream();
        //InputStream do cliente está conectado ao OutputStream do servidor. E Vice versa
        //nesse ponto é necessário fazer o import java.io.*;
        OutputStream output = socket.getOutputStream();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(input));
        //transforma um InputStream em uma interface para leitura de bytes
        // um BufferedReader que permite ler Strings
        
        PrintStream out = new PrintStream(output);
        //è possível transformar um OutPutStrem em um local para gravar bytes de um PrintStream
        //Lembre tudo que está em letra maiúscula são classes prontas do java.net:
        //Classes: InputStream,  OutputStream, BufferedReader
        
        
        //Progrma: Lógica do programa para ecoar a mensagem
        //Na palavra FIM o servidor é encerrado
        while(true){
            String mensagem = in.readLine();
            
            System.out.println("Mensagem recebida do cliente[ "+socket.getInetAddress().getHostName()+"]: "+mensagem);
            //antes de exibir a mensagem do cliente, são chamados médotos para pegar o IP e Nome do Cliente
            
            //se FIM, encerra o laço
            if ("FIM".equals(mensagem)){
               break; 
            }
            //Senão, devolver a mensagem ao cliente
            out.println(mensagem);
            
        }
        
        System.out.println("Encerrando conexão");
        
        in.close();
        //fechando o InputStream
        
        out.close();
        //fechando o OutputStream
        
        socket.close();
        //fechando o socket
        
        System.out.println("Encerrando servidor");
        server.close();
        
    }
    
}
