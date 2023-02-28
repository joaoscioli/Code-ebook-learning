package capitulo08;
/*
*   Adiciona os custos de envio.
* */
public class Shipment extends BoxWeight{

    double cost;

    //constrói clone de um objeto
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }
    // construtor quando todos os parâmetros são especificados
    Shipment(double w, double h, double d,double m, double c) {
        super(w, h, d, m); // call superclass constructor
        cost = c;
    }
    // default constructor
    Shipment() {
        super();
        cost = -1;
    }
    // construtor usado quando o cubo é criado
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }


}
