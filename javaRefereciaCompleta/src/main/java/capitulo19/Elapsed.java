package capitulo19;
//TODO capitulo 19 Exploring java.lang Demonstracao 10

// Temporizando a execução do programa.
public class Elapsed {
    public static void main(String[] args) {
        long start, end;

        System.out.println("Timing a for loop from 0 a 100,000,000");

        // cronometra um loop for de 0 a 100.000.000
        start = System.currentTimeMillis(); // obtém a hora de início
        for (long i = 0; i <  100000000L; i++);
        end = System.currentTimeMillis(); // obtém o tempo final

        System.out.println("Elapsed time: " + (end - start));
    }
}
