package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 09

//Demonstração da classe Currency
import java.util.*;

public class CurDemo {
    public static void main(String[] args) {
        Currency c;

        c = Currency.getInstance(Locale.US);
        System.out.println("Symbol: " + c.getSymbol());
        System.out.println("Default fractional digits: " +
                            c.getDefaultFractionDigits());
    }
}
