package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 16

// Demonstra uma referência de construtor com uma classe genérica.

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        // Cria uma referência ao construtor MyClass<T>.
        MyFunc4<Integer> myClassCons = MyClass2<Integer>::new;

        // Crie uma instância de MyClass<T> por meio dessa referência de construtor.
        MyClass2<Integer> mc = myClassCons.func(100);

        // Use a instância de MyClass<T> recém-criada.
        System.out.println("val in mc is " + mc.getVal());
    }
}
