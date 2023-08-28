package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 07

//Demonstração dos valores Randomicos Gaussianos
import java.util.Random;

public class RandDemo {
    public static void main(String[] args) {
        Random r = new Random();
        double val;
        double sum = 0 ;
        int[] bell = new int[10];

        for (int i = 0; i < 100; i++) {
            val = r.nextGaussian();
            sum += val;
            double t = -2;


            for (int x = 0; x < 10; x++, t += 0.5)
                if (val < t) {
                    bell[x]++;
                    break;
                }
        }
        System.out.println("Average of values: " + (sum/100));

        // exibe curva de sino, lateralmente
        for (int i = 0; i < 10; i++) {
            for (int x = bell[i]; x > 0; x--)
                System.out.print("*");
            System.out.println();
        }
    }
}
