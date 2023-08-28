package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 20

// Use o gerenciamento automático de recursos com Formatter.
import java.util.*;

public class FormatDemo7 {
    public static void main(String[] args) {

        try (Formatter fmt = new Formatter()){
            fmt.format("Formatting %s is easy %d %f", "with Java", 10, 98.6);
            System.out.println(fmt);
        }
    }
}
