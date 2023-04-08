package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 11

// Demonstra uma referência de método para um método de instância
// Agora, esta classe define um método de instância chamado strReverse().
public class MyStringOps1 {
    String strReverse (String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}
