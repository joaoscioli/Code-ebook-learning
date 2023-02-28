//package Capitulo13;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
///* Exibe um arquivo de texto.
//  Para usar este programa, especifique o nome
//  do arquivo que você deseja ver.
//  Por exemplo, para ver um arquivo chamado TEST.TXT,
//  use a seguinte linha de comando.
//  java ShowFile TEST.TXT
//  Essa variação envolve o código que abre e
//  acessa o arquivo em um único bloco try.
//  O arquivo é fechado pelo bloco final.
//*/
//public class ShowFileV2 {
//    public static void main(String[] args) {
//        int i;
//        FileInputStream fin = null;
//        // Primeiro, confirme se um nome de arquivo foi especificado.
//        if(args.length != 1){
//            System.out.println("Usage: ShowFile filename");
//            return;
//        }
//        // O código a seguir abre um arquivo, lê os caracteres até EOF
//        // é encontrado e, em seguida, fecha o arquivo por meio de um bloco final.
//        try {
//            fin = new FileInputStream(args[0]);
//            do {
//                i = fin.read();
//                if (i != -1)
//                    System.out.println((char) i);
//            }while (i != -1);
//        }catch (FileNotFoundException e){
//            System.out.println("File Not Found");
//        }catch (IOException e){
//            System.out.println("An I/0 Error Ocurred");
//        }finally {
//            // Fecha o arquivo em todos os casos.
//        }try {
//            if (fin != null)
//                fin.close();
//        }catch (IOException e){
//            System.out.println("Error Close File");
//        }
//    }
//}
