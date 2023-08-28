package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 28

// Demonstra um pacote de recursos.
import java.util.*;

public class LRBDemo {
    public static void main(String[] args) {
        // Carrega o pacote padrão.
        ResourceBundle rd = ResourceBundle.getBundle("SampleRB");

        System.out.println("English version: ");
        System.out.println("String for Title Key : " + rd.getString("title"));

        System.out.println("String for StopText key: " + rd.getString("StopKey"));

        System.out.println("String for StartText key: " + rd.getString("StartKey"));

        // Carrega o pacote alemão.
        rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);

        System.out.println("\nGerman version: ");
        System.out.println("String for Title key : " + rd.getString("title"));

        System.out.println("String for StopText key: " + rd.getString("StopText"));

        System.out.println("String for StartText key: " + rd.getString("StartText"));
    }
}
