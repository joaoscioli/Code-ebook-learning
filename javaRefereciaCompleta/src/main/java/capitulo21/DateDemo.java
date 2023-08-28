package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 04

// Mostrar data e hora usando apenas métodos Date.
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // Instancia um objeto Date
        Date date = new Date();

        // exibe hora e data usando toString()
        System.out.println(date);

        // Exibe o número de milissegundos desde a meia-noite de 1º de janeiro de 1970 GMT
        long msec = date.getTime();
        System.out.println("Milliseconds since Jan. 1, 1970 GMT = " + msec);
    }
}
