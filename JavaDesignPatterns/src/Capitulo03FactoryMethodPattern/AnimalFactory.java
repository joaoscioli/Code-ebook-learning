package Capitulo03FactoryMethodPattern;
//TODO Exemplo 01 Factory Method Pattern

abstract class AnimalFactory {
    // Este é o "método de fábrica"
    // Observe que eu adio o processo de instanciação
    // para as subclasses.
    protected abstract Animal createAnimal();
}
