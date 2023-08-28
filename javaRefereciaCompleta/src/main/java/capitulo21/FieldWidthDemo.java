package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 15

// Cria uma tabela de quadrados e cubos.
import java.util.*;

public class FieldWidthDemo {
    public static void main(String[] args) {
        Formatter fmt;

        for (int i=1; i<=10; i++) {
            fmt = new Formatter();
            fmt.format("%4d %4d %4d", i, i*i, i*i*i);
            System.out.println(fmt);
            fmt.close();
        }
    }
}
