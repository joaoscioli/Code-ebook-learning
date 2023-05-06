package Capitulo04AbstractFactoryPattern;
//TODO Exemplo 01 Abstract Factory Pattern

// Client.java
public class Client {
    public static void main(String[] args) {

        System.out.println("***Abstract Factory Pattern Demo.***\n");
        AnimalFactory animalFactory;

        // Fazendo um cachorro selvagem e um tigre selvagem através
        // WildAnimalFactory
        animalFactory = new WildAnimalFactory();
        Dog dog = animalFactory.createDog("white");
        Tiger tiger = animalFactory.createTiger("golden and cinnamon");
        dog.displayMe();
        tiger.aboutMe();
        tiger.inviteDog(dog);

        System.out.println("\n************\n");

        // Fazendo um cão de estimação e um tigre de estimação através
        // PetAnimalFactory agora.
        animalFactory = new PetAnimalFactory();
        dog = animalFactory.createDog("black");
        tiger = animalFactory.createTiger("yellow");
        dog.displayMe();
        tiger.aboutMe();
        tiger.inviteDog(dog);
    }
}
