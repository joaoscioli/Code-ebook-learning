package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 06

import java.util.ArrayDeque;

// Demonstra ArrayDeque.
public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Cria um array deque.
        ArrayDeque<String> adq = new ArrayDeque<String>();

        // Use um ArrayDeque como uma pilha.
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.print("Popping the stack: ");

        while (adq.peek() != null)
            System.out.print(adq.pop() + " ");

        System.out.println();
    }
}
