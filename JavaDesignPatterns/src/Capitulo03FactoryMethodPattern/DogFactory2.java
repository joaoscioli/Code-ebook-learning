package Capitulo03FactoryMethodPattern;
//TODO Exemplo 02 Factory Method Pattern

public class DogFactory2 extends AnimalFactory2{
    // Criando e retornando uma instância 'Dog'

    @Override
    protected Animal2 createAnimal(String color) {
        return new Dog2(color);
    }
}
