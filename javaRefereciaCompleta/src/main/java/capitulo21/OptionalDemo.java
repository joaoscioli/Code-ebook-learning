package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 03

// Demonstra vários métodos Optional<T>
import java.util.*;

public class OptionalDemo {
    public static void main(String[] args) {

        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("ABCDEFG");

        if (noVal.isPresent()) System.out.println("This won't be displayed");
        else System.out.println("noVal has no value");

        if (hasVal.isPresent()) System.out.println("The string in hasVal is: " + hasVal.get());

        String defStr = noVal.orElse("Default String");
        System.out.println(defStr);
    }
}
