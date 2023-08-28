package capitulo24;
//TODO capitulo 24 Networking Demonstracao 05

//Demonstração do HttpURLConnection.
import java.net.*;
import java.util.*;

public class HttpURLDemo {
    public static void main(String[] args) throws Exception {
        URL hp = new URL("http://google.com");

        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        //Método de solicitação de exibição.
        System.out.println("Request method is " + hpCon.getRequestMethod());

        //Exibir código de resposta.
        System.out.println("Response code is " + hpCon.getResponseCode());

        //Exibir mensagem de resposta.
        System.out.println("Response Message is " + hpCon.getResponseMessage());

        // Obtenha uma lista dos campos de cabeçalho e um conjunto de
        // chaves de cabeçalho.
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("\nHere is the header:");

        //Exiba todas as chaves e valores do cabeçalho.
        for (String k : hdrField) {
            System.out.println("Key: " + k +
                    " Value: " + hdrMap.get(k));
        }
    }
}
