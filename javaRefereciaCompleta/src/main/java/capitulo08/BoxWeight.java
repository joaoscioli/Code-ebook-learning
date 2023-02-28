package capitulo08;
/*
*   Aqui, a caixa é estendida para incluir o peso.
*    BoxWeight now uses super to initialize its Box attributes. UP01
*    BoxWeight agora implementa totalmente todos os construtores. UP01
*    Add weight. UP02

 * */
public class BoxWeight extends Box{
//uP01
    double weight; //Peso do Box
    // inicializa largura, altura e profundidade usando super()
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // chama o construtor da superclasse
        weight = m;
    }
    // constrói clone de um objeto
    BoxWeight(BoxWeight ob) { // passa os objetos para p construtor
        super(ob);
        weight = ob.weight;
    }
    // Construtor Padrao
    BoxWeight() {
        super();
        weight = -1;
    }
    // construtor usado quando o cubo é criado
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }




    //ORIGINAL
    //    double weight; //Peso do Box
//    // construtor para BoxWeight
//    BoxWeight(double w, double h, double d, double m){
//        width = w;
//        height = h;
//        depth = d;
//        weight = m;
//    }
}
