package capitulo22;

import java.io.FileOutputStream;
import java.io.IOException;

//Demonstração do File Output Stream
//Usando a abordagem try-with-resource
//public class FileOutputStreamDemo2 {
//    public static void main(String[] args) {
//        String source = "Now is the time for all good man\n" + "to come to the aid of their country\n"
//                + "and pay their due taxes";
//        byte[] buf = source.getBytes();
//        // Use try-with-resources para fechar os arquivos.
//        try (FileOutputStream f0 = new FileOutputStream("file1.txt");
//             FileOutputStream f1 = new FileOutputStream("file2.txt");
//             FileOutputStream f2 = new FileOutputStream("file3.txt");){
//            // escreve no primeiro arquivo
//            for (int i = 0; i < buf.length; i += 2)
//                f0.write(buf[i]);
//            // escreve no segundo arquivo
//            f1.write(buf);
//            // grava no terceiro arquivo
//            f2.write(buf, buf.length - buf.length/4, buf.length/4 );
//        }catch (IOException e){
//            System.out.println("An I/0 Error Occurred");
//        }
//    }
//}
