package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 09

import java.util.ArrayList;
import java.util.Spliterator;

//Uma demonstração simples de Spliterator
public class SpliteratorDemo {
    public static void main(String[] args) {
        // Cria uma lista de array para doubles.
        ArrayList<Double> vals = new ArrayList<>();

        // Adiciona valores à lista de array.
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // Use tryAdvance() para exibir o conteúdo de vals.
        System.out.print("Contents of vals:\n");
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        // Cria uma nova lista que contém raízes quadradas.
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        // Use forEachRemaining() para exibir o conteúdo de sqrs.
        System.out.print("Contents of sqrs:\n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
