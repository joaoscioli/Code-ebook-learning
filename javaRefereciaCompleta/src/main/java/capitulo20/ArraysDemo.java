package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 18

// Demonstra Arrays
import java.util.*;


public class ArraysDemo {
    public static void main(String[] args) {

        // Aloca e inicializa array.
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i;

        // Exibe, classifica e exibe o array.
        System.out.print("Original contents: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted: ");
        display(array);

        // Preenche e exibe o array.
        Arrays.fill(array, 2, 6, -1);
        System.out.print("After fill(): ");
        display(array);

        // Classifica e exibe o array.
        Arrays.sort(array);
        System.out.print("After sorting again: ");
        display(array);

        // Pesquisa binária por -9.
        System.out.print("The value -9  is at location ");
        int index = Arrays.binarySearch(array, -9);

        System.out.println(array);
    }

    static void display(int[] array) {
        for (int i : array)
            System.out.print(i + " ");

        System.out.println();
    }
}
