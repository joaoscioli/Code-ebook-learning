package capitulo22;
//TODO capitulo 22 Input/Output: Exploring java.io Demonstracao 12

// Demonstra a entrada sequenciada.
// Este programa usa a abordagem tradicional para fechar um arquivo.
import java.io.*;
import java.util.*;

public class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }

    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (IOException e) {
            return null;
        }
    }
}
