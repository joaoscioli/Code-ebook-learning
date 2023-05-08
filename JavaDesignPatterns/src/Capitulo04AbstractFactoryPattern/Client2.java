package Capitulo04AbstractFactoryPattern;
//TODO Demonstração 02 Abstract Factory Pattern

public class Client2 {
    public static void main(String[] args) {
        System.out.println("***Abstract Factory Pattern Demo.Variation-2.***\n");
        AnimalFactory animalFactory;

        // Fazendo um cachorro selvagem e um tigre selvagem através
        // WildAnimalFactory
        animalFactory = FactoryProvider.getFactory("wild");
        Dog dog = animalFactory.createDog("white");
        Tiger tiger = animalFactory.createTiger("golden and cinnamon");
        dog.displayMe();
        tiger.aboutMe();
        tiger.inviteDog(dog);

        System.out.println("\n************\n");

        // Fazendo um cão de estimação e um tigre de estimação através
        // PetAnimalFactory
        animalFactory = FactoryProvider.getFactory("pet");
        dog = animalFactory.createDog("black");
        tiger = animalFactory.createTiger("yellow");
        dog.displayMe();
        tiger.aboutMe();
        tiger.inviteDog(dog);
    }

}
