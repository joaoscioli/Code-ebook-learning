package capitulo22;
//TODO capitulo 22 Input/Output: Exploring java.io Demonstracao 14

//Demonstração DataInputStream e DataOutputStream
import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {

        // Primeiro, escreva os dados.
        try (DataOutputStream dout =
                     new DataOutputStream(new FileOutputStream("Test.dat"))) {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Output File");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }

        // Agora, leia os dados de volta.
        try (DataInputStream din =
                new DataInputStream(new FileInputStream("Test.dat")) ) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Here are the values: " + d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open Input File");
            return;
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
