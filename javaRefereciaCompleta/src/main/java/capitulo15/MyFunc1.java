package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 12

// Use uma referência de método de instância com diferentes objetos.
// Uma interface funcional que recebe dois argumentos de referência
// e retorna um resultado booleano.
public interface MyFunc1<T> {
    boolean func(T v1, T v2);
}
