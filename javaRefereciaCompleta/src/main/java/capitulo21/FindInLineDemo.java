package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 25

// Demonstra findInLine().
import java.util.*;

public class FindInLineDemo {
    public static void main(String[] args) {
        String instr = "Name: Tom Age: 28 ID: 77";

        Scanner conin = new Scanner(instr);

        // Encontra e exibe a idade.
        conin.findInLine("Age:");

        if (conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");

        conin.close();
    }
}
