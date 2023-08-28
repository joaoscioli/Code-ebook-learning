package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 13

// Use um comparador personalizado.
import java.util.*;

// Um comparador reverso para strings.
public class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {

        // Inverte a comparação.
        return bStr.compareTo(aStr);
    }
    // Não há necessidade de substituir equals ou os métodos padrão.
}
