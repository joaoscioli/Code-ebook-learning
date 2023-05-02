package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 15

// Demonstra uma referência de Construtor.
public class MyClass1 {
    private int val;

    // Este construtor recebe um argumento.
    MyClass1 (int v) {
        val = v;
    }

    // Este é o construtor padrão.
    MyClass1 () {
        val = 0;
    }

    //...
    int getVal () {
        return val;
    }
}
