package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 16

//Demonstração dos especificadores de precisão
import java.util.*;

public class PrecisionDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        // Formata 4 casas decimais.
        fmt.format("%.4f", 123.1234567);
        System.out.println(fmt);
        fmt.close();

        // Formata para 2 casas decimais em um campo de 16 caracteres
        fmt = new Formatter();
        fmt.format("%16.2e", 123.1234567);
        System.out.println(fmt);
        fmt.close();

        // Exibe no máximo 15 caracteres em uma string.
        fmt = new Formatter();
        fmt.format("%.15s", "Formatting with Java is now easy.");
        System.out.println(fmt);
        fmt.close();
    }
}
