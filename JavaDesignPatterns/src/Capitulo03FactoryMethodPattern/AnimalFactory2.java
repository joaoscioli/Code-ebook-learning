package Capitulo03FactoryMethodPattern;
//TODO Exemplo 02 Factory Method Pattern

abstract class AnimalFactory2 {
    public void createAndDisplayAnimal (String color) {
        Animal2 animal;
        animal = createAnimal(color);
        animal.displayBehavior();
    }

    // Este é o "método de fábrica"
    // Observe que eu adio a instanciação
    // processo para as subclasses.
    protected abstract Animal2 createAnimal(String color);
}
