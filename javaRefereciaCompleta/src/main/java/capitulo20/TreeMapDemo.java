package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 12

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        // Cria um mapa de árvore.
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        // Coloca elementos no mapa.
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        // Obtém um conjunto de entradas.
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // Exibe os elementos.
        for (Map.Entry<String, Double> me: set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposite 1000 na conta de John Doe.
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + tm.get("John Doe"));
    }
}
