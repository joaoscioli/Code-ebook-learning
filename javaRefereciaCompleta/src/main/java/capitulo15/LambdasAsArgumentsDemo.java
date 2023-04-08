package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 07

// Use expressões lambda como um argumento para um método.
public class LambdasAsArgumentsDemo {
    // Este método possui uma interface funcional como o tipo de
    // seu primeiro parâmetro. Assim, pode ser passada uma referência a
    // qualquer instância dessa interface, incluindo a instância criada
    // por uma expressão lambda.
    // O segundo parâmetro especifica a string a ser operada.
    static String stringOp (StringFunc1 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inSt = "Lambdas add power to Java";
        String outSt;

        System.out.println("Here is input string: " + inSt);
        // Aqui, uma expressão lambda simples que coloca uma string em maiúscula
        // é passado para stringOp( ).

        outSt = stringOp((str) -> str.toUpperCase(), inSt);
        System.out.println("The string in uppercase: " + outSt);

        // Isso passa um bloco lambda que remove os espaços.
        outSt = stringOp((str) -> {
            String result = "";
            int i;

            for (i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);

            return result;
        }, inSt);
        System.out.println("The string with spaces removed: " + outSt);

        // Claro, também é possível passar uma instância StringFunc
        // criado por uma expressão lambda anterior. Por exemplo,
        // após a execução desta declaração, reverse refere-se a um
        // instância de StringFunc.
        StringFunc1 reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        // Agora, reverse pode ser passado como primeiro parâmetro para stringOp()
        // já que se refere a um objeto StringFunc.
        System.out.println("The string reversed: " +stringOp(reverse, inSt));
    }
}
