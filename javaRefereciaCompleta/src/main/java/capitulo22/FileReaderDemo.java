package capitulo22;
//TODO capitulo 22 Input/Output: Exploring java.io Demonstracao 15

//Demonstracao do FileReader
import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("FileReaderDemo.java")) {
            int c;

            // Lê e exibe o arquivo.
            while ((c = fr.read()) != -1) System.out.print((char) c);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
