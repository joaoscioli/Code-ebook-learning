package capitulo23;
//TODO capitulo 23 Exploring NIO Demonstracao 02;

// Uma forma mais compacta de abrir um canal.
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelRead2 {
    public static void main(String[] args) {
        int count;

        // Aqui, o canal é aberto no Path retornado por Path.of().
        // Não há necessidade da variável filepath.
        try (SeekableByteChannel fChan = Files.newByteChannel(Path.of("test.txt"))) {

            // Aloca um buffer.
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                // Lê um buffer.
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
        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
