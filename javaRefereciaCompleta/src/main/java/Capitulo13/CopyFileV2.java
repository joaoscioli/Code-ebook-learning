//package Capitulo13;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
///* Uma versão do CopyFile que usa try-with-resources.
//  Demonstra dois recursos (neste caso arquivos) sendo
//  gerenciado por uma única instrução try.
//*/
//
//
//public class CopyFileV2 {
//    public static void main(String[] args) throws IOException {
//        int i;
//        // Primeiro, confirme se ambos os arquivos foram especificados.
//        if(args.length != 2){
//            System.out.println("Usage: CopyFile from to");
//            return;
//        }
//        // Abre e gerencia dois arquivos por meio da instrução try.
//        try (FileInputStream fin = new FileInputStream(args[0]);
//             FileOutputStream fout = new FileOutputStream(args[1]))
//        {
//            do {
//               i = fin.read();
//               if(i != -1) fout.write(i);
//            }while (i != -1);
//        }catch (IOException e){
//            System.out.println("I/O Error: " + e);
//        }
//    }
//}
