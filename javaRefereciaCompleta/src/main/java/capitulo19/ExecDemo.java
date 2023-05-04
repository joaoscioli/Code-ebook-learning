package capitulo19;
//TODO capitulo 19 Exploring java.lang Demonstracao 06

// Demonstrar exec().
public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("notepad");
        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }
    }
}
