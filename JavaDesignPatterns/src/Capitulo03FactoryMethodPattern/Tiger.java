package Capitulo03FactoryMethodPattern;
//TODO Exemplo 01 Factory Method Pattern

public class Tiger implements Animal{

    public Tiger () {
        System.out.println("\nA Tiger is created.");
    }

    public void displayBehavior() {
        System.out.println("It says: Halum.");
        System.out.println("It loves to roam in a jungle");
    }
}
