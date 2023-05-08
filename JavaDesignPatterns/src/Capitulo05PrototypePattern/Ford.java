package Capitulo05PrototypePattern;
//TODO Demonstração 01 Prototype Pattern

import java.util.Random;

//Ford.java
public class Ford extends BasicCar{
    public Ford (String modelName) {
        this.modelName = modelName;
        // O preço base de um carro Ford
        basePrice = 40000;
        // Define o preço na estrada
        onRoadPrice = basePrice + (new Random()).nextInt(1000);
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }

    @Override
    public String toString () {
        return "Model: " + modelName + "\nPrice: " + onRoadPrice;
    }
}
