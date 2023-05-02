package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 04

public class toStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Box b: " + b; // concatena o objeto Box

        System.out.println(b); // converte caixa em string
        System.out.println(s);
    }
}
