package capitulo10;
// Demonstração do finally.
//public class FinallyDemo {
//    // Lança uma exceção fora do método.
//    static void procA(){
//        try {
//            System.out.println("Dentro do procA");
//            throw new RuntimeException("demo");
//        }finally {
//            System.out.println("procA's finalizado");
//        }
//    }
//    // Retorna de dentro de um bloco try.
//    static void procB(){
//        try {
//            System.out.println("Dento do procB");
//            return;
//        }finally {
//            System.out.println("procB's finalizado");
//        }
//    }
//    // Executa um bloco try normalmente.
//    static void procC(){
//        try {
//            System.out.println("Dentro do procC");
//        }finally {
//            System.out.println("procC's finalizado");
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            procA();
//        }catch (Exception e){
//            System.out.println("Exeção Capturada");
//        }
//        procB();
//        procC();
//    }
//}
