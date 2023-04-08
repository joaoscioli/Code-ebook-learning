package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 04

// Um bloco lambda que calcula o fatorial de um valor int.

public class BlockLambdaDemo {
    public static void main(String[] args) {
        // Este bloco lambda calcula o fatorial de um valor int.
        NumericFunc fatorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = i + result;

            return result;
        };
        System.out.println("The factorial of 3 is " + fatorial.func(3));
        System.out.println("The factorial of 5 is " + fatorial.func(5));
    }
}
