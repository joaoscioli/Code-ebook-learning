package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 11

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Usando trim() para processar comandos.
public class UseTrim {
    public static void main(String[] args)
    throws IOException
    {
        // cria um BufferedReader usando System.in
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        String str;

        System.out.println("Enter 'stop' to quit.");
        System.out.println("Enter State: ");
        do {
            str = br.readLine();
            str = str.trim();

            if (str.equals("Illinois"))
                System.out.println("Capital is Springfield.");
            else if (str.equals("Missouri"))
                System.out.println("Capital is Jefferson City.");
            else if (str.equals("California"))
                System.out.println("Capital is Sacramento.");
            else if (str.equals("Washington"))
                System.out.println("Capital is Olympia");
            //...
        } while (!str.equals("stop"));
    }
}
