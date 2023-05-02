package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 17

// Demonstra inserir().
public class InsertDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I Java!");

        sb.insert(2, "like ");
        System.out.println(sb);
    }
}
