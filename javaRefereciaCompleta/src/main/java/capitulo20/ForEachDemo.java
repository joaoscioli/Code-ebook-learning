package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 08

import java.util.ArrayList;

// Use o loop for-each para percorrer uma coleção.
public class ForEachDemo {
    public static void main(String[] args) {
        // Cria uma lista de array para inteiros.
        ArrayList<Integer> vals = new ArrayList<Integer>();

        // Adiciona valores à lista de array.
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        // Use o loop for para exibir os valores.
        System.out.print("Contents of vals: " );
        for (int v : vals)
            System.out.print(v + " ");

        System.out.println();

        // Agora, some os valores usando um loop for.
        int sum = 0;
        for (int v : vals)
            sum += v;

        System.out.println("Sum of values: " + sum);
    }
}
