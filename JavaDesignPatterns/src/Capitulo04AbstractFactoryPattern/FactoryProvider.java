package Capitulo04AbstractFactoryPattern;
//TODO Demonstração 02 Abstract Factory Pattern

// Provedor de fábrica
// (É opcional para você)
public class FactoryProvider {
    public static AnimalFactory getFactory (String factoryType) {
        if (factoryType.contains("wild")) {
            return new WildAnimalFactory();
        } else if (factoryType.contains("pet")) {
            return new PetAnimalFactory();
        } else {
            throw new IllegalArgumentException("You need  to pass either wild or pet as argument.");
        }
    }
}
