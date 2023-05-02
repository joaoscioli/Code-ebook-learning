package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 15

// Demonstra uma referência de Construtor.
public class ConstructorRefDemo {
    public static void main(String[] args) {

        // Cria uma referência ao construtor MyClass.
        // Como func() em MyFunc recebe um argumento, new
        // refere-se ao construtor parametrizado em MyClass,
        // não é o construtor padrão.
        MyFunc3 myClassCons = MyClass1::new;

        // Cria uma instância de MyClass por meio dessa referência de construtor.
        MyClass1 mc = myClassCons.func(100);

        // Use a instância de MyClass recém-criada.
        System.out.println("val in mc is " + mc.getVal());
    }
}
