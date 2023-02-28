package capitulo10;
// Demonstra o encadeamento de exceções.
//public class ChainExcDemo {
//    static void demoproc(){
//        //cria uma exceção
//        NullPointerException e = new NullPointerException("Top Layer");
//        // adiciona uma causa
//        e.initCause(new ArithmeticException("cause"));
//        throw e;
//    }
//
//    public static void main(String[] args) {
//        try {
//            demoproc();
//        }catch (NullPointerException e){
//            //exibe a exceção de nível superior
//            System.out.println("Caught: " + e);
//            //exibe a exceção de causa
//            System.out.println("Original cause: " + e.getCause());
//        }
//    }
//}
