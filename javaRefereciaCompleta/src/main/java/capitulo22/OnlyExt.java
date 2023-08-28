package capitulo22;

//TODO capitulo 22 Input/Output: Exploring java.io Demonstracao 03

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt implements FilenameFilter {
        String ext;
        public OnlyExt(String ext) {
            this.ext = "." + ext;
        }
        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
}
