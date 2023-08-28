package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 07

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// Demonstra iteradores.
public class IteratorDemo {
    public static void main(String[] args) {
        // Cria uma lista de array.
        ArrayList<String> al = new ArrayList<String>();

        // Adiciona elementos à lista de array.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Use o iterador para exibir o conteúdo de al.
        System.out.print("Original Contents of al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Modifica os objetos que estão sendo iterados.
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }

        System.out.print("Modified contents of al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Agora, exiba a lista de trás para frente.
        System.out.print("Modifeid list backwards: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
