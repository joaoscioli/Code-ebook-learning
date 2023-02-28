package capitulo08;
/*
* Este programa usa herança para estender Box.
* Estenda o BoxWeight para incluir os custos de envio. Comece com Caixa. UP01
* */
public class Box {
//UP01
    private double width;
    private double height;
    private double depth;

    // construir clone de um objeto
    Box(Box ob) { // passar o objeto para o construtor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // construtor usado quando todas as dimensões especificadas
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // construtor usado quando nenhuma dimensão é especificada
    Box() {
        width = -1; // use -1 para indicar
        height = -1; // um não inicializado
        depth = -1; // box
    }
    // construtor usado quando o cubo é criado
    Box(double len) {
        width = height = depth = len;
    }
    // calcular e retornar volume
    double volume() {
        return width * height * depth;
    }


    //
//    double width;
//    double height;
//    double depth;
//    // constrói clone de um objeto
//    Box (Box ob){   //passa o objeto para o construtor
//        width = ob.width;
//        height = ob.height;
//        depth = ob.depth;
//    }
//    // construtor usado quando todas as dimensões especificadas
//    Box(double w, double h, double d){
//        width = w;
//        height = h;
//        depth = d;
//    }
//    Box(){
//        width = -1; // usa -1 para indicar
//        height = -1; // um não inicializado
//        depth = -1; //box
//    }
//    // construtor usado quando o cubo é criado
//    Box(double len){
//        width = height = depth = len;
//    }
//    // calcula e retorna o volume
//    double volume(){
//        return width * height * depth;
//    }
}
