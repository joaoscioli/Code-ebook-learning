package capitulo23;
//TODO capitulo 23 Exploring NIO Demonstracao 03;

// Use um arquivo mapeado para ler um arquivo.
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelRead {
    public static void main(String[] args) {

        // Obtém um canal para um arquivo dentro de um bloco try-with-resources.
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("test.txt"))) {

            // Obtém o tamanho do arquivo.
            long fSize = fChan.size();

            // Agora, mapeie o arquivo em um buffer.
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            // Lê e exibe bytes do buffer.
            for (int i = 0; i < fSize; i++)
                System.out.print((char) mBuf.get());

            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
