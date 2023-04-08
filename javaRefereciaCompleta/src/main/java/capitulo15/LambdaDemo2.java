package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 02

// Demonstra uma expressão lambda que recebe um parâmetro.

public class LambdaDemo2 {
    public static void main(String[] args) {
        // Uma expressão lambda que testa se um número é par.
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10)) System.out.println("10 is even");
        if (!isEven.test(9)) System.out.println("9 is not even");

        // Agora, use uma expressão lambda que testa se um número
        // é não negativo.
        NumericTest isNotNeg = (n) -> n >= 0;

        if(isNotNeg.test(1)) System.out.println("1 is non-negative");
        if (!isNotNeg.test(-1)) System.out.println("-1 is negative");
    }
}
