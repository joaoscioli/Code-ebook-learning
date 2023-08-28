package capitulo24;
//TODO capitulo 24 Networking Demonstracao 03

//Demonstração de URL
import java.net.*;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp =  new URL("http://www.HerbSchildt.com/WhatsNew");

        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());

        System.out.println("Host: " + hp.getHost());
        System.out.println("File: " + hp.getFile());
        System.out.println("Ext: " + hp.toExternalForm());

    }
}
