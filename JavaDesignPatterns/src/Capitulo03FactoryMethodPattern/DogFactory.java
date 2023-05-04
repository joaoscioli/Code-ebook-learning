package Capitulo03FactoryMethodPattern;
//TODO Exemplo 01 Factory Method Pattern

// A classe DogFactory é usada para criar cachorros
public class DogFactory extends AnimalFactory{
    // Criando e retornando uma instância 'Dog'
    @Override
    protected Animal createAnimal() {
        return new Dog();
    }
}
