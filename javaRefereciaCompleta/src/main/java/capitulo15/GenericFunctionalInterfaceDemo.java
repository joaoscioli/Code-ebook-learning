package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 06

// Use uma interface funcional genérica com expressões lambda.
public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Use uma versão baseada em String de SomeFunc.
        SomeFunc<String> reverse = (str) -> {
          String result = "";
          int i;

          for (i = str.length() -1; i >= 0; i--)
              result += str.charAt(i);

          return result;
        };

        System.out.println("Lambda reversed is " + reverse.func("Lambda"));
        System.out.println("Expression reversed is " + reverse.func("Expression"));

        // Agora, use uma versão baseada em Integer de SomeFunc.
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = i * result;

            return result;
        };
        System.out.println("The factorial of 3 is " + factorial.func(3));
        System.out.println("The factorial of 5 is " + factorial.func(5));
    }
}
