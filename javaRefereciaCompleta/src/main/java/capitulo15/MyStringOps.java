package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 10

// Um exemplo de captura de uma variável local do escopo envolvente.
// Esta classe define um método estático chamado strReverse().
public class MyStringOps {
    // Um método estático que inverte uma string.
    static String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}
