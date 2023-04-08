package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 10

// Demonstra uma referência de método para um método estático.

public class MethodRefDemo {
    // Este método possui uma interface funcional como o tipo de
    // seu primeiro parâmetro. Assim, pode ser passado qualquer instância
    // dessa interface, incluindo uma referência de método.
    static String stringOp(StringFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;
        // Aqui, uma referência de método para strReverse é passada para stringOp().
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}
