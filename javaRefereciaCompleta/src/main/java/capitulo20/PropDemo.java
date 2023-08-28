package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 23

// Demonstra uma lista de propriedades.
import java.util.*;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();

        capitals.setProperty("Illinois", "Springfield");
        capitals.setProperty("Missouri", "Jefferson City");
        capitals.setProperty("Washington", "Olympia");
        capitals.setProperty("California", "Sacramento");
        capitals.setProperty("Indiana", "Indianapolis");

        // Obtém um set-view das chaves.
        Set<?> states = capitals.keySet();

        // Mostra todos os estados e capitais.
        for (Object name : states)
            System.out.println("The capital of " +
                    name + " is " +
                    capitals.getProperty((String) name) + ".");

        System.out.println();

        // Procure o estado que não está na lista -- especifique o padrão.
        String str = capitals.getProperty("Florida", "Not Found");
        System.out.println("The capital of Florida is " + str + ".");
    }
}
