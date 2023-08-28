package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 24

// Use o Scanner para calcular uma média de uma lista de
// Valores Separados Por Virgula.
import java.util.*;
import java.io.*;

public class SetDelimiters {
    public static void main(String[] args) throws IOException{

        int count = 0;
        double sum = 0.0;

        // Grava a saída em um arquivo.
        FileWriter fout = new FileWriter("test.txt");

        // Agora, armazene os valores em uma lista separada por vírgulas.
        fout.write("2, 3.4,    5, 6, 7.4, 9.1, 10.5, done");
        fout.close();

        FileReader fin = new FileReader("Test.txt");

        Scanner src = new Scanner(fin);

        // Definir delimitadores para espaço e vírgula.
        src.useDelimiter(", *");

        // Lê e soma números.
        while (src.hasNext()) {
            if (src.hasNextDouble()) {
                sum += src.nextDouble();
                count++;
            } else {
                String str = src.next();
                if (str.equals("done")) break;
                else {
                    System.out.println("File format error.");
                    return;
                }
            }
        }

        src.close();
        System.out.println("Average is " + sum / count);
    }
}
