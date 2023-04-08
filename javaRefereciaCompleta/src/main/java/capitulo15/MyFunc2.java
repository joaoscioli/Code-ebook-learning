package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 13


// Demonstra uma referência de método para um método genérico
// declarado dentro de uma classe não genérica.
// Uma interface funcional que opera em um array
// e um valor, e retorna um resultado int.
public interface MyFunc2<T>{
    int func(T[] vals, T v);
}
