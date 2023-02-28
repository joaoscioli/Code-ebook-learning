package capitulo08;

public class Rectangle extends Figure{

    Rectangle(double a, double b){
        super(a,b);
    }

    //sobrecarga do metodo
    double area() {
        System.out.println("A area interna do retangulo.");
        return dim1 * dim2;
    }
}
