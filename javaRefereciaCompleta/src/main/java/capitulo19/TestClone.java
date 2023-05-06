package capitulo19;
//TODO capitulo 19 Exploring java.lang Demonstracao 13

// Demonstra o método clone()
public class TestClone implements Cloneable {
    int a;
    double b;

    // Este método chama o clone() do objeto.
    TestClone cloneTest () {
        try {
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not allowed.");
            return this;
        }
    }
}
