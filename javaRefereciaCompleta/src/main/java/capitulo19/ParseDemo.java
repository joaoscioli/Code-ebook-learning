package capitulo19;
//TODO capitulo 19 Exploring java.lang Demonstracao 03

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Este programa soma uma lista de números inseridos
  pelo usuário. Ele converte a representação de string
  de cada número em um int usando parseInt().
*/
public class ParseDemo {
    public static void main(String[] args) throws Exception {
        // cria um BufferedReader usando System.in
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        String str;
        int i;
        int sum = 0;

        System.out.println("Enter numbers, 0 to quit.");
        do {
            str = br.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Invalid  format");
                i = 0;
            }
            sum += i;
            System.out.println("Current sum is: " + sum);
        } while (i != 0);
    }
}
