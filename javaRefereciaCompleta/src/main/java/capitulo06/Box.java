package capitulo06;
/*
*   Um programa que usa a classe Box.
*   Chame este arquivo BoxDemo.java
*   Este programa inclui um método dentro da classe box.
*   Agora, volume() retorna o volume de uma caixa.
*   Este programa usa um método parametrizado.
*   Aqui, Box usa um construtor para inicializar  as dimensões de uma caixa.
*   Aqui, Box usa um construtor parametrizado para inicializar as dimensões de uma caixa.
*   Um uso redundante "this".
*   Use isso para resolver colisões de namespace.
* */
public class Box {
    double width;
    double height;
    double depth;

//    void volume(){
//        System.out.print("O volume da caixa é: ");
//        System.out.println(width * height * depth);
//    }
// calcula e retorna o volume
    double volume(){
        return width * height * depth;
    }
    // define as dimensões da caixa
//    void setDim(double w, double h, double d){
//        width = w;
//        height = h;
//        depth = d;
//    }
    //Esse é um construtor para Box
//    Box(){
//        System.out.println("Construinto um Box");
//        width = 10;
//        height = 10;
//        depth = 10;
//    }
    //Esse é um construtor com parametros
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
