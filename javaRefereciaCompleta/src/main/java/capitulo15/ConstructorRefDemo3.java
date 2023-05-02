package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 17

// Implemente uma fábrica de classes simples usando uma referência de construtor.
public class ConstructorRefDemo3 {

    // Um método de fábrica para objetos de classe. A classe deve
    // tem um construtor que recebe um parâmetro do tipo T.
    // R especifica o tipo de objeto que está sendo criado.
    static <R, T> R myClassFactory (MyFunc5<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {

        // Cria uma referência para um construtor MyClass.
        // Nesse caso, new refere-se ao construtor que
        // recebe um argumento.
        MyFunc5 <MyClass3 <Double>, Double> myClassCons = MyClass3 <Double>::new;

        // Cria uma instância de MyClass usando o método de fábrica.
        MyClass3 <Double> mc = myClassFactory (myClassCons, 100.1);

        // Use a instância de MyClass recém-criada.
        System.out.println("val in mc is " + mc.getVal());

        // Agora, crie uma classe diferente usando myClassFactory().
        MyFunc5<MyClass3, String> myClassCons2 = MyClass3::new;

        // Cria uma instância de MyClass2 usando o método de fábrica.
        MyClass3 mc2 = myClassFactory(myClassCons2, "Lambda");

        // Use the instance of MyClass just created.
        System.out.println("str in mc2 is " + mc2.getVal());
    }
}
