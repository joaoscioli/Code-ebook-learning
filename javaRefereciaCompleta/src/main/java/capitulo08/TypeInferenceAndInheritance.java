package capitulo08;
/*
public class TypeInferenceAndInheritance {
    // Retorna algum tipo de objeto MyClass.
    static MyClass getObj(int witch) {
        switch (witch) {
            case 0:
                return new MyClass();
            case 1:
                return new FirstDerivedClass();
            default:
                return new SecondDerivedClass();
        }
    }

    public static void main(String[] args) {
        // Mesmo que getObj() retorne diferentes tipos de
        // objetos dentro da hierarquia de herança MyClass,
        // seu tipo de retorno declarado é MyClass. Como resultado,
        // em todos os três casos mostrados aqui, o tipo do
        // variáveis são inferidas como sendo MyClass, mesmo que
        // diferentes tipos de objetos derivados são obtidos.
        // Aqui, getObj() retorna um objeto MyClass.
        var mc = getObj(0);
        // In this case, a FirstDerivedClass object is returned.
        var mc2 = getObj(1);
        // Here, a SecondDerivedClass object is returned.
        var mc3 = getObj(2);
        // Because the types of both mc2 and mc3 are inferred
        // as MyClass (because the return type of getObj() is
        // MyClass), neither mc2 nor mc3 can access the fields
        // declared by FirstDerivedClass or SecondDerivedClass.
        // mc2.x = 10; // Wrong! MyClass does not have an x field.
        // mc3.y = 10; // Wrong! MyClass does not have a y field.

    }
}
*/