package capitulo23;
//TODO capitulo 23 Exploring NIO Demonstracao 05;

// Grava em um arquivo mapeado.
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelWrite {
    public static void main(String[] args) {

        // Obtém um canal para um arquivo dentro de um bloco try-with-resources.
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("test.txt"),
                                                                    StandardOpenOption.WRITE,
                                                                    StandardOpenOption.READ,
                                                                    StandardOpenOption.CREATE)) {

            // Em seguida, mapeie o arquivo em um buffer.
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            // Escreve alguns bytes no buffer.
            for (int i = 0; i < 26; i++)
                mBuf.put((byte) ('A' + i));

        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
