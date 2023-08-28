package capitulo23;
//TODO capitulo 23 Exploring NIO Demonstracao 11;

// Exibe um diretório apenas com os arquivos graváveis.
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class DirList2 {
    public static void main(String[] args) {
        String dirname = "\\MyDir";

        // Cria um filtro que retorna verdadeiro apenas para arquivos graváveis.
        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path filename) throws IOException {
                if (Files.isWritable(filename)) return true;
                return false;
            }
        };

        // Obtenha e gerencie um fluxo de diretório de arquivos graváveis.
        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Path.of(dirname), how) ) {
            System.out.println("Directory of " + dirname);

            for (Path entry : dirstrm) {
                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attribs.isDirectory())
                    System.out.print("<DIR> ");
                else
                    System.out.print("   ");

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirname + " is not a directory.");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
