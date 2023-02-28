//package Capitulo13;
///* Esta versão do programa ShowFile usa um try-with-resources
//  instrução para fechar automaticamente um arquivo depois que ele não for mais necessário.
//*/
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class ShowFileV3 {
//    public static void main(String[] args) {
//        int i;
//        // Primeiro, confirme se um nome de arquivo foi especificado.
//        if(args.length != 1){
//            System.out.println("Usage: ShowFile filename");
//            return;
//        }
//        // O código a seguir usa uma instrução try-with-resources para abrir
//        // um arquivo e, em seguida, fecha-o automaticamente quando o bloco try é deixado.
//        try(FileInputStream fin = new FileInputStream(args[0])){
//            do {
//                i = fin.read();
//                if (i != -1) System.out.println((char)i);
//            }while (i != -1);
//        }catch (FileNotFoundException e){
//            System.out.println("File Not Found");
//        }catch (IOException e){
//            System.out.println("An I/O Error Occurred");
//        }
//    }
//}
