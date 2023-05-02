package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 03

// Usando concatenação para evitar filas longas.
public class ConCat {
    public static void main(String[] args) {
        String longStr = "This could have been " +
                         "a very long line that would hava " +
                         "wrapped around. But string concatenation " +
                         "prevents this.";

        System.out.println(longStr);
    }
}
