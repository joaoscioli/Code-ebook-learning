package capitulo17;
//TODO capitulo 17 Switch Expressions, Records, and Other Recently Added Features Demonstracao 07

// Demonstra recuo em um bloco de texto.
public class TextBlockDemo {

    public static void main(String[] args) {
        String str = """
                Text blocks support strings that
                span two or more lines and preserve
                    identation. They reduce the
                        tedium associated with be
                    entry of long or complicated
                strings into a program.
                """;

        System.out.println(str);
    }
}
