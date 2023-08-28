package capitulo23;
//TODO capitulo 23 Exploring NIO Demonstracao 12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "\\MyDir";

        System.out.println("Directory tree starting with " + dirname + ":\n");

        try {
            Files.walkFileTree(Path.of(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("I/O Error");
        }
    }
}
