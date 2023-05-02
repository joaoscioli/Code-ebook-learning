package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 16

// Demonstra uma referência de construtor com uma classe genérica.
// MyFunc agora é uma interface funcional genérica.
public interface MyFunc4<T> {
    MyClass2<T> func(T v);
}
