package Capitulo03FactoryMethodPattern;
//TODO Exemplo 01 Factory Method Pattern

public class Dog implements Animal{

    public Dog () {
        System.out.println("\nA dog is created.");
    }
    public void displayBehavior() {
        System.out.println("It says: Bow-Wow");
        System.out.println("It prefers barking.");
    }
}
