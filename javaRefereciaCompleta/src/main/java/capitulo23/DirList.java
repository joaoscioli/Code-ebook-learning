package capitulo23;
//TODO capitulo 23 Exploring NIO Demonstracao 10;

// Exibe um diretório.
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class DirList {
    public static void main(String[] args) {
        String dirname = "\\MyDir";

        // Obtenha e gerencie um fluxo de diretório dentro de um bloco try.
        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Path.of(dirname))) {
            System.out.println("Directory of " + dirname);

            // Como DirectoryStream implementa Iterable, nós
            // pode usar um loop "foreach" para exibir o diretório.
            for (Path entry : dirstrm) {
                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attribs.isDirectory())
                    System.out.print("<DIR> ");
                else
                    System.out.print("    ");

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Path Error: " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirname + "is not a directory.");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
