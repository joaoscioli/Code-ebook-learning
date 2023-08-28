package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 04

import java.util.HashSet;

// Demonstra HashSet.
public class HashSetDemo {
    public static void main(String[] args) {
        // Cria um conjunto de hash.
        HashSet<String> hs = new HashSet<String>();

        // Adiciona elementos ao conjunto de hash.
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);
    }
}
