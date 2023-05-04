package Capitulo03FactoryMethodPattern;
//TODO Exemplo 02 Factory Method Pattern

public class Dog2 implements Animal2{
    public Dog2 (String color) {
        System.out.println("\nA dog with " + color + " color is created.");
    }
    public void displayBehavior() {
        System.out.println("It says: Bow-Wow.");
        System.out.println("It prefers barking.");
    }
}
