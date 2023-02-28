package capitulo08;
/*
*   Usando polimorfismo em tempo de execução.
* */
public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("A area das figuras está indefinida");
        return 0;
    }
}
