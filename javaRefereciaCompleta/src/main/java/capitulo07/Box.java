package capitulo07;
/*
*   Aqui, Box define três construtores para inicializar as dimensões de uma caixa de várias maneiras.
*   Aqui, Box permite que um objeto inicialize outro. (up 01)
* */
public class Box {
    double width;
    double height;
    double depth;
    // Observe este construtor. Leva um objeto do tipo Box.
    Box(Box ob){ // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // construtor usado quando todas as dimensões especificadas
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    // construtor usado quando nenhuma dimensão é especificada
    Box(){
        this.width = -1; // usa -1 para indicar
        this.height = -1; //um não inicializado
        this.depth = -1;//box
    }
    // construtor usado quando o cubo é criado
    Box(double len){
        width = height = depth = len;
    }
    // calcula e retorna o volume
    double volume(){
        return  width * height * depth;
    }
}
