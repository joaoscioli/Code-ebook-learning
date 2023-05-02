package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 15

// Demonstra charAt() e setCharAt().
public class SetCharAtDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("buffer before = " + sb);
        System.out.println("CharAt(1) before = " + sb.charAt(1));

        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("buffer after = " + sb);
        System.out.println("CharAt(1) after = " + sb.charAt(1));
    }
}
