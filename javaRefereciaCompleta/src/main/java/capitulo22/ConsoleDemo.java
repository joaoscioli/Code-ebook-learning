package capitulo22;
//TODO capitulo 22 Input/Output: Exploring java.io Demonstracao 21;

//Demonstracao do Console
import java.io.*;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        // Obtém uma referência ao console.
        con = System.console();
        // Se nenhum console estiver disponível, saia.
        if (con == null) return;

        // Lê uma string e a exibe.
        str = con.readLine("Enter a string: ");
        con.printf("Here is your string: %s\n", str);
    }
}
