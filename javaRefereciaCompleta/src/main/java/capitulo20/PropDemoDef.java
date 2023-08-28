package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 24

// Use uma lista de propriedades padrão.
import java.util.*;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.setProperty("Florida", "Tallahassee");
        defList.setProperty("Wisconsin", "Madison");

        Properties capitals = new Properties(defList);

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
                    capitals.getProperty((String) name));

        System.out.println();

        // A Flórida agora será encontrada na lista padrão.
        String str = capitals.getProperty("Florida");
        System.out.println("The capital of Florida is " + str + ".");
    }
}
