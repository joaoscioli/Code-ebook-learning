package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 12

//Formatando Data e Hora
import java.util.*;

public class TimeDateFormat {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();

        // Exibe o formato padrão de 12 horas.
        fmt.format("%tr", cal);
        System.out.println(fmt);
        fmt.close();

        // Exibe informações completas de hora e data.
        fmt = new Formatter();
        fmt.format("%tc",cal);
        System.out.println(fmt);
        fmt.close();

        // Exibe apenas hora e minuto.
        fmt = new Formatter();
        fmt.format("%tl:%tM", cal, cal);
        System.out.println(fmt);
        fmt.close();

        // Exibe o mês por nome e número.
        fmt = new Formatter();
        fmt.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(fmt);
        fmt.close();
    }
}
