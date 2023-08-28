package capitulo24;
//TODO capitulo 24 Networking Demonstracao 02

//Demonstracao de Sockets
import java.net.*;
import java.io.*;

public class Whois {
    public static void main(String[] args) throws Exception {
        int c;

        // Cria um socket conectado a internic.net, porta 43.
        Socket s = new Socket("whois.internic.net", 43);

        // Obtém fluxos de entrada e saída.
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        // Constrói uma string de solicitação.

        String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
        // Converte para bytes.
        byte[] buf = str.getBytes();

        // Enviar pedido.
        out.write(buf);

        // Lê e exibe a resposta.
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();
    }
}
