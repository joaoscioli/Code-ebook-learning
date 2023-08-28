package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 03

import java.util.LinkedList;

// Demonstra LinkedList.
public class LinkedListDemo {
    public static void main(String[] args) {
        // Cria uma lista encadeada.
        LinkedList<String> ll = new LinkedList<String>();

        // Adiciona elementos à lista encadeada.
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addLast("A");

        ll.add(1, "A");

        System.out.println("Original contents of ll: " + ll);

        // Remove elementos da lista encadeada.
        ll.remove("F");
        ll.remove(2);

        System.out.println("Contents of 11 after deletion: " + 11);

        // Remove primeiro e último elementos.
        ll.removeFirst();
        ll.removeLast();

        System.out.println("ll after deleting first and last: " + ll);

        // Get and set a value.
        String val = ll.get(2);
        ll.set(2, val + " Changed");

        System.out.println("ll after change: " + ll);

    }

}
