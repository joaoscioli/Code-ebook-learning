package capitulo08;
/*
*   Usando métodos e classes abstratos
* */
abstract class FigureA {
    double dim1;
    double dim2;

    FigureA(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    // area agora é um método abstrato
    abstract double area();



}
