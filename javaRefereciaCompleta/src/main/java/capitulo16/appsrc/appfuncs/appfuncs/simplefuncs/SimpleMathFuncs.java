package capitulo16.appsrc.appfuncs.appfuncs.simplefuncs;
//TODO capitulo 16 modulos Demonstracao 01

// Algumas funções matemáticas simples.
public class SimpleMathFuncs {

    // Determina se a é um fator de b.
    public static boolean isFactor (int a, int b) {
        if (a % b == 0) return true;
        return false;
    }

    // Retorna o menor fator positivo que a e b têm em comum.
    public static int lcf (int a, int b) {
        // Fator usando valores positivos.
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for (int i = 2; i <= min / 2; i++ ) {
            if (isFactor(i, a) && isFactor(i, b))
                return i;
        }
        return 1;
    }

    // Retorna o maior fator positivo que a e b têm em comum.
    public static int gcf (int a, int b) {
        // Fator usando valores positivos.
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for (int i = min/2; i >= 2; i--) {
            if (isFactor(i, a) && isFactor(i, b))
                return i;
        }
        return 1;
    }
}
