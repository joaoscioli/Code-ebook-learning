package capitulo15;
import java.util.function.Function;

//TODO capitulo 15 expressoes lambdas Demonstracao 18

// Use a interface funcional interna do Function.
// Importa a interface Function.
public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {

        // Este bloco lambda calcula o fatorial de um valor int.
        // Desta vez, Function é a interface funcional.
        Function<Integer,Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("The factoral of 3 is " + factorial.apply(3));
        System.out.println("The factoral of 5 is " + factorial.apply(5));
    }
}
