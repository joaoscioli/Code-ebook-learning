package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 11

//Demonstração dos especificadores de formato %f e %e
import java.util.*;

public class FormatDemo2 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        for (double i = 1.23; i < 1.0e+6; i *= 100) {
            fmt.format("%f %e ",i ,i);
            System.out.println(fmt);
        }
        fmt.close();
    }
}
