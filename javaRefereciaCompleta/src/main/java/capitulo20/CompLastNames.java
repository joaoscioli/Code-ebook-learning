package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 16


// Use thenComparing() para classificar pelo sobrenome e depois pelo nome.
import java.util.*;

// Um comparador que compara sobrenomes.
public class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        // Encontra o índice do início do sobrenome.
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
