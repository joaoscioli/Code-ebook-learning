package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 15

// Use um comparador para classificar contas por sobrenome.
import java.util.*;

// Compara as últimas palavras inteiras em duas strings.
public class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        // Encontra o índice do início do sobrenome.
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if (k == 0) // os sobrenomes combinam, verifique o nome completo
            return aStr.compareToIgnoreCase(bStr);
        else
            return k;
    }

    // Não há necessidade de sobrescrever equals.
}
