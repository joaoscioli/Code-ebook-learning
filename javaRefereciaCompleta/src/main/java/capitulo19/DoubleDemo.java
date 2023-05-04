package capitulo19;
//TODO capitulo 19 Exploring java.lang Demonstracao 01

public class DoubleDemo {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(3.14159);
        Double d2 = Double.valueOf("314159E-5");

        System.out.println(d1 + " = " + d2 + " -> " + d1.equals(d2));
    }
}
