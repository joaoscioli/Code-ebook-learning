package Capitulo04AbstractFactoryPattern;
//TODO Exemplo 01 Abstract Factory Pattern

// Concrete Factory2: Pet animal factory
// PetAnimalFactory.java
public class PetAnimalFactory extends AnimalFactory {
    public PetAnimalFactory () {
        System.out.println("You opt for a pet animal factory.\n");
    }

    @Override
    public Tiger createTiger (String color) {
        return  new PetTiger(color);
    }

    @Override
    public Dog createDog (String color) {
        return new PetDog(color);
    }
}
