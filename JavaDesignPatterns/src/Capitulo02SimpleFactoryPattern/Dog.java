package Capitulo02SimpleFactoryPattern;
//TODO Exemplo 01 Simple Factory Patterns

public class Dog implements Animal{

    public Dog() {
        System.out.println("\nA dog is created.");
    }
    @Override
    public void displayBehaviour() {
        System.out.println("It says: Bow-Wow.");
        System.out.println("It prefers barking.");
    }
}
