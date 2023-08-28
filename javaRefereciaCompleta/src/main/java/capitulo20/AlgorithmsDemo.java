package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 17

// Demonstra vários algoritmos.
import java.util.*;

public class AlgorithmsDemo {
    public static void main(String[] args) {

        // Cria e inicializa a lista encadeada.
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // Cria um comparador de ordem reversa.
        Comparator<Integer> r = Collections.reverseOrder();

        // Ordena a lista usando o comparador.
        Collections.sort(ll,r);

        System.out.print("List sorted in reverse: ");
        for (int i : ll)
            System.out.print(i +" ");

        System.out.println();

        // Lista aleatória.
        Collections.shuffle(ll);

        // Exibe lista aleatória.
        System.out.print("List shuffled: ");
        for (int i : ll)
            System.out.print(i + " ");

        System.out.println();
        System.out.println("Minimum: " + Collections.min(ll));
        System.out.println("Maximum: " + Collections.max(ll));
    }
}
