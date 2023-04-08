package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 11

// Demonstra uma referência de método para um método de instância
public class MethodRefDemo2 {
    // Este método possui uma interface funcional como o tipo de
    // seu primeiro parâmetro. Assim, pode ser passado qualquer instância
    // dessa interface, incluindo referências de método.
    static String stringOp(StringFunc3 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        // Cria um objeto MyStringOps.
        MyStringOps1 strOps = new MyStringOps1();

        // Agora, uma referência de método para o método de instância strReverse
        // é passado para stringOp().
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Original String: " + inStr);
        System.out.println("String reversed: " + outStr);
    }
}
