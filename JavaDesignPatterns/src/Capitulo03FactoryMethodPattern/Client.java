package Capitulo03FactoryMethodPattern;
//TODO Exemplo 01 Factory Method Pattern

public class Client {
    public static void main(String[] args) {
        System.out.println("***Factory Method Pattern Demo.***");
        AnimalFactory factory;
        Animal animal;

        // Cria um tigre e exibe seu comportamento
        // usando TigerFactory.
        factory = new TigerFactory();
        animal = factory.createAnimal();
        animal.displayBehavior();

        // Cria um cachorro e exibe seu comportamento
        // usando DogFactory.
        factory = new DogFactory();
        animal = factory.createAnimal();
        animal.displayBehavior();
    }
}
