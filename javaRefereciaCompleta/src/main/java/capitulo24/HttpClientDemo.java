package capitulo24;
//TODO capitulo 24 Networking Demonstracao 07

//Demonstração de HttpClient
import java.net.*;
import java.net.http.*;
import java.io.*;
import java.util.*;

public class HttpClientDemo {
    public static void main(String[] args) throws Exception {

        // Obtenha um cliente que use as configurações padrão.
        HttpClient myHC = HttpClient.newHttpClient();

        // Crie uma solicitação.
        HttpRequest myReq = HttpRequest.newBuilder(
                new URI("http://www.google.com/")).build();

        // Envie a solicitação e obtenha a resposta. Aqui, um InputStream é usado para o corpo.
        HttpResponse<InputStream> myResp = myHC.send(myReq,
                HttpResponse.BodyHandlers.ofInputStream());

        // Exibir código de resposta e método de resposta.
        System.out.println("Response code is " + myResp.statusCode());
        System.out.println("Request method is " + myReq.method());

        // Obtenha cabeçalhos da resposta.
        HttpHeaders hdrs = myResp.headers();

        // Obtenha um mapa dos cabeçalhos.
        Map<String, List<String>> hdrMap = hdrs.map();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("\nHere is the header:");

        // Exiba todas as chaves e valores do cabeçalho.
        for (String k : hdrField) {
            System.out.println("Key: " + k +
                    " Value: " + hdrMap.get(k));
        }

        // Mostre o corpo.
        System.out.println("\nHere is the body: ");

        InputStream input = myResp.body();
        int c;
        // Leia e exiba o corpo inteiro.
        while ((c  = input.read()) != -1) {
            System.out.print((char) c);
        }


    }
}
