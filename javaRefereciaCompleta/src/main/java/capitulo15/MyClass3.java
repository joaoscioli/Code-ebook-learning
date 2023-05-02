package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 17

// Implemente uma fábrica de classes simples usando uma referência de construtor.
// Uma classe genérica simples.
public class MyClass3<T> {
    private T val;

    // Um construtor que recebe um argumento.
    MyClass3 (T v) {
        val = v;
    }

    // O construtor padrão. Este construtor
    // NÃO é usado por este programa.
    MyClass3 () {
        val = null;
    }

    T getVal () {
        return val;
    }
}
