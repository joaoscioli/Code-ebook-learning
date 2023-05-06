package Capitulo04AbstractFactoryPattern;
//TODO Exemplo 01 Abstract Factory Pattern

// Abstract Factory.java
public abstract class AnimalFactory {
    protected abstract Tiger createTiger(String color);
    protected abstract Dog createDog(String color);
}
