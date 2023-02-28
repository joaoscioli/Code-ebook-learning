//package Capitulo13;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
///* Display a text file.
//Para usar este programa, especifique o nome
//do arquivo que você deseja ver.
//Por exemplo, para ver um arquivo chamado TEST.TXT,
//use a seguinte linha de comando.
//java ShowFile TEST.TXT
//*/
//
//
//public class ShowFile {
//    public static void main(String[] args) {
//        int i;
//        FileInputStream fin;
//        // Primeiro, confirme se um nome de arquivo foi especificado.
//        if(args.length!= 1){
//            System.out.println("Usage: ShowFile filename");
//            return;
//        }
//        // Tentativa de abrir o arquivo.
//        try {
//            fin = new FileInputStream(args[0]);
//        }catch (FileNotFoundException e){
//            System.out.println("Cannot Open File");
//            return;
//        }
//        // Neste ponto, o arquivo está aberto e pode ser lido.
//        // O seguinte lê os caracteres até que o EOF seja encontrado.
//        try {
//            do {
//                i = fin.read();
//                if(i != -1)
//                    System.out.println((char)i);
//            }while (i != -1);
//        }catch (IOException e){
//            System.out.println("Error Reading File");
//        }
//        // Feche o arquivo
//        try {
//            fin.close();
//        }catch (IOException e){
//            System.out.println("Error Closing File");
//        }
//    }
//}
