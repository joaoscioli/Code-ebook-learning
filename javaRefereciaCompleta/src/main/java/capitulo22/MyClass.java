package capitulo22;
//TODO capitulo 22 Input/Output: Exploring java.io Demonstracao 22;


import java.io.Serializable;

public class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}
