package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 17

// Implemente uma fábrica de classes simples usando uma referência de construtor.
// Uma classe simples e não genérica.
public class MyClass4 {
    String str;

    // Um construtor que recebe um argumento.
    MyClass4 (String s) {
        str = s;
    }

    // O construtor padrão. Esse
    // o construtor NÃO é usado por este programa.
    MyClass4 () {
        str = "";
    }

    //...
    String getVal () {
        return str;
    }
}
