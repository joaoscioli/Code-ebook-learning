package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 13

import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        // Cria um conjunto de árvores.
        TreeSet<String> ts = new TreeSet<String>(new MyComp());

        // Adiciona elementos ao conjunto de árvores.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Exibe os elementos.
        for (String element : ts)
            System.out.print(element + " ");

        System.out.println();
    }
}
