package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 05

// Um bloco lambda que inverte os caracteres em uma string.
public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        // Este bloco lambda inverte os caracteres em uma string.
        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };
        System.out.println("Lambda reversed is " + reverse.func("Lambda"));
        System.out.println("Expression reversed is " + reverse.func("Expression"));
    }
}
