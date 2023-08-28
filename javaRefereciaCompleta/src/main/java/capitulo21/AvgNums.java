package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 21

// Use o Scanner para calcular uma média dos valores.
import java.util.*;


public class AvgNums {
    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;

        System.out.println("Enter numbers to average.");

        // Lê e soma números.
        while (conin.hasNext()) {
            if (conin.hasNextDouble()) {
                sum += conin.nextDouble();
                count++;
            } else {
                String str = conin.next();
                if (str.equals("done")) break;
                else {
                    System.out.println("Data format error.");
                    return;
                }
            }
        }

        conin.close();
        System.out.println("Average is " + sum / count);
    }
}
