package capitulo19;
//TODO capitulo 19 Exploring java.lang Demonstracao 09

public class PBDemo {
    public static void main(String[] args) {

        try {
            ProcessBuilder proc =
                    new ProcessBuilder("notepad.exe", "testfile");
            proc.start();
        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }
    }
}
