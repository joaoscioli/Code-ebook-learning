package capitulo10;
/* As instruções Try podem ser aninhadas implicitamente via
  chamadas para métodos. */
//public class MethNestTry {
//    static void nesttry(int a){
//        try { // bloco try aninhado
//            /* Se um argumento de linha de comando for usado,
//            então uma exceção de divisão por zero
//            será gerado pelo código a seguir. */
//            if (a == 1) a = a/(a-a); //Divisão por Zero
//            /* Se dois argumentos de linha de comando forem usados,
//            em seguida, gere uma exceção fora dos limites. */
//            if (a == 2){
//                int[] c = {1};
//                c[42] = 99; // gera uma exceção fora dos limites
//            }
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Índice de matriz fora dos limites: " + e);
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            int a = args.length;
//            /* Se nenhum argumento de linha de comando estiver presente,
//            a seguinte declaração irá gerar
//            uma exceção de divisão por zero. */
//            int b = 42 / a;
//            System.out.println("a: " + a);
//            nesttry(a);
//        }catch (ArithmeticException e){
//            System.out.println("DIVISÃO POR ZERO: " + e);
//        }
//    }
//}
