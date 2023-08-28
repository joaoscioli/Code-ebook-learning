package capitulo22;

//TODO capitulo 22 Input/Output: Exploring java.io Demonstracao 03

//Diretório de arquivos .HTML
import java.io.*;
import java.io.File;

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/java";
        File f1 = new File(dirname,"\\..\\");
        FilenameFilter only = new OnlyExt("html");
        String[] s = f1.list(only);
        for (int i=0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
