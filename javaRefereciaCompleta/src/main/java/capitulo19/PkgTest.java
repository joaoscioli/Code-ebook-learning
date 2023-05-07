package capitulo19;
//TODO capitulo 19 Exploring java.lang Demonstracao 17

// Demonstrar pacote
public class PkgTest {
    public static void main(String[] args) {
        Package[] pkgs;

        pkgs = Package.getPackages();

        for (int i = 0; i < pkgs.length; i++)
            System.out.println(
                    pkgs[i].getName() + " " +
                    pkgs[i].getImplementationTitle() + " " +
                    pkgs[i].getImplementationVendor() + " " +
                    pkgs[i].getImplementationVersion()
            );
    }
}
