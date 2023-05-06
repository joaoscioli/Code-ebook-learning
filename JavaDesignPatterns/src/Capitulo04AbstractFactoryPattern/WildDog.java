package Capitulo04AbstractFactoryPattern;
//TODO Exemplo 01 Abstract Factory Pattern

// Concrete product-B1
// WildDog.java
public class WildDog implements Dog {
    public WildDog (String color) {
        System.out.println("A wild dog with " + color + " color is created.");
    }

    @Override
    public void displayMe () {
        System.out.println("The " + this + " says: I prefer to roam freely in jungles. Bow-Wow.");
    }

    @Override
    public String toString () {
        return "wild dog";
    }

}
