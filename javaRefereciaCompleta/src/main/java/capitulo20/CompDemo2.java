package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 14

// Use uma expressão lambda para criar um comparador reverso.
import java.util.*;

public class CompDemo2 {
    public static void main(String[] args) {

        // Passa um comparador reverso para TreeSet() via a
        // expressão lambda.
        TreeSet<String> ts = new TreeSet<String>(
                (aStr, bStr) ->bStr.compareTo(aStr));

        // Adiciona elementos ao conjunto de árvores.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Exibe os elementos.
        for (String element: ts)
            System.out.print(element + " ");

        System.out.println();
    }
}
