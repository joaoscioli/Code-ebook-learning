package Capitulo03FactoryMethodPattern;
//TODO Exemplo 02 Factory Method Pattern

public class Client2 {
    public static void main(String[] args) {
        System.out.println("***Factory Method pattern modified demonstration.***");
        AnimalFactory2 factory;

        // Cria um tigre e exibe seu comportamento
        // usando TigerFactory.
        factory = new TigerFactory2();
        factory.createAndDisplayAnimal("yellow");

        // Cria um cachorro e exibe seu comportamento
        // usando DogFactory.
        factory = new DogFactory2();
        factory.createAndDisplayAnimal("white");
    }
}
