package capitulo10;
/* Este programa contém um erro.
  Uma subclasse deve vir antes de sua superclasse em
  uma série de instruções catch. Se não,
  código inacessível será criado e um
  resultará em um erro de tempo de compilação.
*/
//public class SuperSubCatch {
//    public static void main(String[] args) {
//        try {
//            int a = 0;
//            int b = 42 / a;
//        }catch (Exception e){
//            System.out.println("Exeção Genérica Catch");
//        }
//        /* Este catch nunca é alcançado porque
//        ArithmeticException é uma subclasse de Exception. */
//        catch (ArithmeticException e){// ERROR – unreachable
//        System.out.println("Não executará esse bloco");
//        }
//    }
//}
