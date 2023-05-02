package capitulo18;
//TODO capitulo 18 String Handling Demonstracao 04

// Substitui toString() para a classe Box.
public class Box {
    double width;
    double height;
    double depth;

    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public String toString () {
        return "Dimensions are " + width + " by " +
                depth + " by " + height + ".";
    }
}
