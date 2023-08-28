package capitulo24;
//TODO capitulo 24 Networking Demonstracao 04

//Demonstração do URLConnection.
import java.net.*;
import java.io.*;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws Exception{
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        //Pegar Data
        long d = hpCon.getDate();
        if (d==0)
            System.out.println("No date information.");
        else
            System.out.println("Date: " + new Date(d));

        //obter tipo de conteúdo
        System.out.println("Content-Type" + hpCon.getContentType());

        //obter tipo de conteúdo
        d = hpCon.getExpiration();
        if (d==0)
            System.out.println("No expiration information.");
        else
            System.out.println("Expires: " + new Date(d));

        //obter a data da última modificação
        d = hpCon.getLastModified();
        if (d==0)
            System.out.println("No last-modified information.");
        else
            System.out.println("Last-Modified: " + new Date(d));

        //obter comprimento do conteúdo
        long len = hpCon.getContentLengthLong();
        if (len == -1)
            System.out.println("Content length unavailable.");
        else
            System.out.println("Content-Length: " + len);

        if (len != 0) {
            System.out.println("=== Content ===");
            InputStream input = hpCon.getInputStream();
            while (((c = input.read()) != -1)) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("No content available.");
        }
    }
}
