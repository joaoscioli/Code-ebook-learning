package Capitulo03FactoryMethodPattern;
//TODO Exemplo 02 Factory Method Pattern

public class Tiger2 implements Animal2{
    public Tiger2 (String color) {
        System.out.println("\nA tiger with " + color + " color is created.");
    }
    public void displayBehavior() {
        System.out.println("It says: Halum.");
        System.out.println("It loves to roam in a jungle.");
    }
}
