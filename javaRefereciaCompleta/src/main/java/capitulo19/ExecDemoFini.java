package capitulo19;
//TODO capitulo 19 Exploring java.lang Demonstracao 07

// Aguarde até que o bloco de notas seja finalizado.
public class ExecDemoFini {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("notepad");
            p.waitFor();
        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }
        System.out.println("Notepad returned " + p.exitValue());
    }
}
