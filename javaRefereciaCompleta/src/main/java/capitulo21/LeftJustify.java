package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 17

//Demonstração da justificação a esquerda
import java.util.*;

public class LeftJustify {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        // Justificar à direita por padrão
        fmt.format("|%10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();

        // Agora, justifique à esquerda.
        fmt = new Formatter();
        fmt.format("|%-10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();
    }
}
