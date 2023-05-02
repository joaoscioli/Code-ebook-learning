package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 20

// Demonstra substituir()
public class replaceDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a test.");

        sb.replace(5, 7, "was");
        System.out.println("After replace: " + sb);
    }
}
