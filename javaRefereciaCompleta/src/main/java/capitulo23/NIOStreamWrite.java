package capitulo23;
//TODO capitulo 23 Exploring NIO Demonstracao 08;

// Demonstra saída de stream baseada em NIO.
import java.io.*;
import java.nio.file.*;

public class NIOStreamWrite {
    public static void main(String[] args) {
        // Abra o arquivo e obtenha um stream vinculado a ele.
        try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Path.of("test.txt")))) {
            // Grava alguns bytes no stream.
            for (int i = 0; i < 26; i++)
                fout.write((byte) ('A' + i));
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
