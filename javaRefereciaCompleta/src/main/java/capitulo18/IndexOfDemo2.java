package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 21


public class IndexOfDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("one two one");
        int i;

        i = sb.indexOf("one");
        System.out.println("First index: " + i);

        i = sb.lastIndexOf("one");
        System.out.println("Last index: " + i);
    }
}
