package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 02

import java.util.ArrayList;

// Converte um ArrayList em um array.
public class ArrayListToArray {
    public static void main(String[] args) {
        // Cria uma lista de array.
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Adiciona elementos à lista de array.
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Contents of al: " + al);

        // Pega a matriz.
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;

        // Soma o array.
        for (int i : ia) sum += i;

        System.out.println("Sum is: " + sum);

    }
}
