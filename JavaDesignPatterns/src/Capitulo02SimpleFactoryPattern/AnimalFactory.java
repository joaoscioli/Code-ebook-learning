package Capitulo02SimpleFactoryPattern;
//TODO Exemplo 01 Simple Factory Patterns

public class AnimalFactory {
    public Animal createAnimal(String animalType) {
        Animal animal;
        if (animalType.equals("dog")) {
            animal = new Dog();
        } else if (animalType.equals("tiger")){
            animal = new Tiger();
        } else {
            System.out.println("You can created either a dog or a tiger.");
            throw new IllegalArgumentException("Unknown animal cannot be instantiated");
        }
        return animal;
    }
}
