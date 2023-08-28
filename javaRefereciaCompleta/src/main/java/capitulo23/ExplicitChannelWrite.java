package capitulo23;
//TODO capitulo 23 Exploring NIO Demonstracao 04;

// Grava em um arquivo usando NIO.
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelWrite {
    public static void main(String[] args) {

        // Obtém um canal para um arquivo dentro de um bloco try-with-resources.
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("test.txt"),
                                                                    StandardOpenOption.WRITE,
                                                                    StandardOpenOption.CREATE)) {
            // Cria um buffer.
            ByteBuffer mBuf = ByteBuffer.allocate(26);

            // Escreve alguns bytes no buffer.
            for (int i = 0; i < 26; i++)
                mBuf.put((byte) ('A' + i));

            // Redefina o buffer para que ele possa ser gravado.
            mBuf.rewind();

            // Grava o buffer no arquivo de saída.
            fChan.write(mBuf);

        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
            System.exit(1);
        }
    }
}
