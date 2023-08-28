package capitulo23;
//TODO capitulo 23 Exploring NIO Demonstracao 01;

// Use Channel I/O para ler um arquivo.
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        // Primeiro, obtenha um caminho para o arquivo.
        try {
            filepath = Path.of("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
            return;
        }

        // Em seguida, obtenha um canal para esse arquivo dentro de um bloco try-with-resources.
        try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {

            // Aloca um buffer.
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                // Read a buffer.
                count = fChan.read(mBuf);

                // Para quando o fim do arquivo é atingido.
                if (count != -1) {

                    // Rebobina o buffer para que possa ser lido.
                    mBuf.rewind();

                    // Lê os bytes do buffer e mostra
                    // eles na tela como caracteres.
                    for (int i = 0; i < count; i++)
                        System.out.print((char) mBuf.get());
                }
            } while (count != -1);

            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
