package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 08

// Lança uma exceção de uma expressão lambda.
public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4.0};

        // Este bloco lambda calcula a média de um array de doubles.
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;

            if (n.length == 0)
                throw new EmptyArrayException();

            for (int i = 0; i < n.length; i++)
                sum += n[i];

            return sum / n.length;
        };
        System.out.println("The average is " + average.func(values));

        // Isso faz com que uma exceção seja lançada.
        System.out.println("The average is " + average.func(new double[0]));
    }
}
