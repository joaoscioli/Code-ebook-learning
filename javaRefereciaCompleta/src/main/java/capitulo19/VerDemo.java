package capitulo19;
//TODO capitulo 19 Exploring java.lang Demonstracao 08

// Demonstra contadores de versão Runtime.Version.
public class VerDemo {
    public static void main(String[] args) {
        Runtime.Version ver = Runtime.version();

        // Exibe contadores individuais.
        System.out.println("Feature release counter: " + ver.feature());
        System.out.println("Interim release counter: " + ver.interim());
        System.out.println("Update release counter: " + ver.update());
        System.out.println("Pacth release counter: " + ver.patch());
    }
}
