package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 12

// Demonstra toUpperCase() e toLowerCase().
public class ChangeCase {
    public static void main(String[] args) {
        String s = "This is a test.";

        System.out.println("Original: " + s);

        String upper = s.toUpperCase();
        String lower = s.toLowerCase();

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
