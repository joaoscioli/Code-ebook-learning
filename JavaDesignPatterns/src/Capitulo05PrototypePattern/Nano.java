package Capitulo05PrototypePattern;
//TODO Demonstração 01 Prototype Pattern

import java.util.Random;

//Nano.java
public class Nano extends BasicCar{
    public Nano (String modelName) {
        this.modelName = modelName;
        // O preço base para um carro Nano
        basePrice = 5000;
        // Define o preço na estrada
        onRoadPrice = basePrice + (new Random()).nextInt(1000);
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }

    @Override
    public String toString() {
        return "Model: " + modelName + "\nPrice: " + onRoadPrice;
    }
}
