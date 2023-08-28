package capitulo23;
//TODO capitulo 23 Exploring NIO Demonstracao 12;

// Um exemplo simples que usa walkFileTree( ) para exibir uma árvore de diretórios.
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

// Cria uma versão personalizada de SimpleFileVisitor que substitui
// o método visitFile( ).
public class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
