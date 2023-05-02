package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 01

// Constrói uma String a partir de outra.
public class MakeString {
    public static void main(String[] args) {
        char[] c = {'J','a','v','a'};
        String s1 = new String(c);
        String s2 = new String(s1);

        System.out.println(s1);
        System.out.println(s2);
    }
}
