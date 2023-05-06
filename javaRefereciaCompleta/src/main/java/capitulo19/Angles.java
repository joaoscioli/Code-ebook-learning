package capitulo19;
//TODO capitulo 19 Exploring java.lang Demonstracao 15

// Demonstra toDegrees() e toRadians().
public class Angles {
    public static void main(String[] args) {
        double theta = 120.0;

        System.out.println(theta + " degress is " +
                           Math.toRadians(theta) + " radians.");

        theta = 1.312;
        System.out.println(theta + " radians is " +
                           Math.toDegrees(theta) + " degress.");
    }
}
