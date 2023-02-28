package capitulo10;
// Um exemplo de instruções try aninhadas.
//public class NestTry {
//    public static void main(String[] args) {
//        try {
//            int a = args.length;
//            /* Se nenhum argumento de linha de comando estiver presente,
//            a seguinte declaração irá gerar
//            uma exceção de divisão por zero. */
//            int b = 42 / a;
//            System.out.println("a: " + a);
//            try { // bloco try aninhado
//                /* Se um argumento de linha de comando for usado,
//                então uma exceção de divisão por zero
//                será gerado pelo código a seguir. */
//                if (a == 1) a = a/(a-a); // divisão por zero
//                /* Se dois argumentos de linha de comando forem usados,
//                em seguida, gere uma exceção fora dos limites. */
//                if (a == 2) {
//                    int[] c = {1};
//                    c[42] = 99; // gera uma exceção fora dos limites
//                }
//            } catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Índice de matriz fora dos limites: " + e);
//            }
//        }catch (ArithmeticException e){
//            System.out.println("DIVISÃO POR 0: " + e);
//        }
//    }
//}
