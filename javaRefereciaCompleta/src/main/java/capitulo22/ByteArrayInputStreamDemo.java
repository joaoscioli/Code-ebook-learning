package capitulo22;
//TODO capitulo 22 Input/Output: Exploring java.io Demonstracao 07

//Demonstração do ByteArrayInputStream
import java.io.*;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte[] b = tmp.getBytes();
        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b,0,3);
    }
}
