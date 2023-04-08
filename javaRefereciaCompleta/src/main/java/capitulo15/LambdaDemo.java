package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 01

public class LambdaDemo {
    public static void main(String[] args) {

        MyNumber myNum; // declara uma referência de interface

        // Aqui, a expressão lambda é simplesmente uma expressão constante.
        // Quando é atribuído a myNum, uma instância de classe é
        // construído no qual a expressão lambda é implementada
        // o método getValue() em MyNumber.
        myNum = () -> 123.45;

        // Chama getValue(), que é fornecido pelo atributo previamente atribuído
        // expressão lambda.
        System.out.println("A fixed value: " + myNum.getValue());

        // Aqui, uma expressão mais complexa é usada.
        myNum = () -> Math.random() * 1000;

        // Estes chamam a expressão lambda na linha anterior.
        System.out.println("A random value: " + myNum.getValue());
        System.out.println("Another random value: " + myNum.getValue());

        // Uma expressão lambda deve ser compatível com o método
        // definido pela interface funcional. Portanto, isso não funcionará:
        //myNum = () -> "123.45"; //Error!
    }
}
