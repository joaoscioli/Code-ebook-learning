package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 19

// Demonstra delete() e deleteCharAt()
public class DeleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a test.");

        sb.delete(4, 7);
        System.out.println("After delete: " + sb);

        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb);
    }
}
