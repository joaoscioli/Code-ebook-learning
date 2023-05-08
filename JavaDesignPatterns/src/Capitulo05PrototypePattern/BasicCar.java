package Capitulo05PrototypePattern;
//TODO Demonstração 01 Prototype Pattern

// BasicCar.java
abstract class BasicCar implements Cloneable {
    public String modelName;
    public int basePrice = 0, onRoadPrice = 0;

    public String getModelName() {
        return modelName;
    }

    public void setModelName (String modelname) {
        this.modelName = modelname;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar)super.clone();
    }
}
