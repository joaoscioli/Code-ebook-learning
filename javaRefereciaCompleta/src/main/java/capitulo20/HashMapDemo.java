package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 11

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        // Cria um mapa de hash.
        HashMap<String, Double> hm = new HashMap<String, Double>();

        // Coloca os elementos no mapa
        hm.put("Jhon Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralph Smith", -19.08);

        // Obtém um conjunto de entradas.
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // Exibe o conjunto.
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        // Deposite 1000 na conta de John Doe.
        double balance = hm.get("Jhon Doe");
        hm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + hm.get("John Doe"));
    }
}
