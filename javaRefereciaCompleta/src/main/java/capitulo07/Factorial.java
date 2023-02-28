package capitulo07;
/*
*   Um exemplo simples de recursão.
* */
public class Factorial {
    // este é um método recursivo
    int fact(int n){
        int result;
        if(n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
