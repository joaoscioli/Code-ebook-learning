package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 05

import java.util.TreeSet;

// Demonstra TreeSet.
public class TreeSetDemo {
    public static void main(String[] args) {
        // Cria um conjunto de árvores.
        TreeSet<String> ts = new TreeSet<String>();

        // Adiciona elementos ao conjunto de árvores.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
        System.out.println(ts.subSet("C","F"));
    }

}
