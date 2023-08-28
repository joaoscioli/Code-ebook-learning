package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 14

// Demonstra um especificador de largura de campo.
import java.util.*;

public class FormatDemo4 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);
        System.out.println(fmt);
        fmt.close();
    }
}
