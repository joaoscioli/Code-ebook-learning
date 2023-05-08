package Capitulo04AbstractFactoryPattern;
//TODO Demonstração 03 Abstract Factory Pattern

public class Client3 {
    AnimalFactory factory;

    public Client3 (AnimalFactory factory) {
        this.factory = factory;
    }

    public AnimalFactory getFactory () {
        return factory;
    }

    public static void main(String[] args) {
        System.out.println("***Abstract Factory Pattern Demo.Variation-3.***\n");
        AnimalFactory animalFactory;
        // Fazendo um cachorro selvagem e um tigre selvagem através
        // WildAnimalFactory
        Client3 client = new Client3(new WildAnimalFactory());
        animalFactory = client.getFactory();
        Dog dog = animalFactory.createDog("white");
        Tiger tiger = animalFactory.createTiger("golden and cinnamon");
        dog.displayMe();
        tiger.aboutMe();
        tiger.inviteDog(dog);

        System.out.println("\n************\n");

        // Fazendo um cão de estimação e um tigre de estimação através
        // PetAnimalFactory agora.
        client = new Client3(new PetAnimalFactory());
        animalFactory = client.getFactory();
        dog = animalFactory.createDog("black");
        tiger = animalFactory.createTiger("yellow");
        dog.displayMe();
        tiger.aboutMe();
        tiger.inviteDog(dog);
    }
}
