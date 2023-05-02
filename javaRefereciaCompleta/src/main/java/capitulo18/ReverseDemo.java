package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 18

// Usando reverse() para reverter um StringBuffer.
public class ReverseDemo {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("abcdef");

        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
