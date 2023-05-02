package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 16

// Demonstra uma referência de construtor com uma classe genérica.

public class MyClass2<T> {
    private T val;

    // Um construtor que recebe um argumento.
    MyClass2 (T v) {
        val = v;
    }

    // Este é o construtor padrão.
    MyClass2 () {
        val = null;
    }

    // ...
    T getVal () {
        return val;
    }
}
