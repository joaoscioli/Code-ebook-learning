package capitulo08;

public class Triangle extends Figure{

    Triangle(double a, double b){
        super(a,b);
    }
    // substitui a área do triângulo retângulo
    double area(){
        System.out.println("A area interna do Triangulo: ");
        return dim1 * dim2 / 2;
    }
}
