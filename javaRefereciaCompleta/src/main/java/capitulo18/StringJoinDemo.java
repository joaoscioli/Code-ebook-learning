package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 13

// Demonstra o método join() definido por String.
public class StringJoinDemo {
    public static void main(String[] args) {

        String result = String.join(" ", "Alpha", "Beta", "Gama");
        System.out.println(result);

        result = String.join(", ", "Jhon", "ID#: 569",
                             "E-mail: John@HerbSchildt.com");
        System.out.println(result);
    }
}
