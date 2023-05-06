package Capitulo04AbstractFactoryPattern;
//TODO Exemplo 01 Abstract Factory Pattern

// Concrete Factory 1: Wild animal factory
// WildAnimalFactory.java
public class WildAnimalFactory extends AnimalFactory {
    public WildAnimalFactory () {
        System.out.println("You opt for a wild animal factory.\n");
    }
    @Override
    public Tiger createTiger (String color) {
        return new WildTiger(color);
    }
    @Override
    public Dog createDog (String color) {
        return new WildDog(color);
    }

}
