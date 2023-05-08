package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 01

import java.util.ArrayList;

// Demonstra ArrayList.
public class ArrayListDemo {
    public static void main(String[] args) {
        // Cria uma lista de array.
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: " +
                            al.size());

        // Adiciona elementos à lista de array.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Size of al after additions: " +
                            al.size());

        // Exibe a lista de matrizes.
        System.out.println("Contents of al: " + al);

        // Remove elementos da lista de array.
        al.remove("F");
        al.remove(2);

        System.out.println("Size of al after deletions: " +
                            al.size());
        System.out.println("Contents of a1: " + al);
    }
}
