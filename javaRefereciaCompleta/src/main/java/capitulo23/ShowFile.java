package capitulo23;
//TODO capitulo 23 Exploring NIO Demonstracao 07;

/* Exibe um arquivo de texto usando código NIO baseado em fluxo.
  Para usar este programa, especifique o nome do arquivo que você deseja ver.
  Por exemplo, para ver um arquivo chamado TEST.TXT, use a seguinte linha de comando.
  java ShowFile TEST.TXT
*/

import java.io.*;
import java.nio.file.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        // Primeiro, confirme se um nome de arquivo foi especificado.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // Abra o arquivo e obtenha um stream vinculado a ele.
        try (InputStream fin = Files.newInputStream(Path.of(args[0]))) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (InvalidPathException e) {
            System.out.println("Path Error: " + e);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
