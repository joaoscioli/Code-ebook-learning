package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 16

// Demonstra append().
public class AppendDemo {
    public static void main(String[] args) {
        String s;
        int a = 42;
        StringBuffer sb = new StringBuffer(40);

        s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(s);
    }
}
