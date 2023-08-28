package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 10

import java.util.LinkedList;


public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<Address>();

        // Adiciona elementos à lista encadeada.
        ml.add(new Address("J.W. West", "11 Oak Ave","Urbana","IL","61801"));
        ml.add(new Address("Ralph Baker","1142 Maple Lane", "Mahomet","IL","61853"));
        ml.add(new Address("Tom Carlton","867 Elm St","Champaign","IL","61820"));

        // Exibe a lista de discussão.
        for (Address element : ml)
            System.out.println(element + "\n");

        System.out.println();
    }
}
