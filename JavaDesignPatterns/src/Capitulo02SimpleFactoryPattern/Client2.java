package Capitulo02SimpleFactoryPattern;
//TODO Exemplo 02 Simple Factory Patterns

public class Client2 {
    public static void main(String[] args) {

        System.out.println("*** Simples Factory Demonstration-2.***");
        AnimalFactory2 factory = new AnimalFactory2();

        Animal animal = factory.createAnimal(AnimalFactory2.Type.DOG);
        animal.displayBehaviour();

        animal = factory.createAnimal(AnimalFactory2.Type.TIGER);
        animal.displayBehaviour();

        // Erro de tempo de compilação agora
        // animal = factory.createAnimal("cat”);
        // animal.displayBehavior();
    }
}
