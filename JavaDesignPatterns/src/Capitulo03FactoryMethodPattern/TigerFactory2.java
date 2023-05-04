package Capitulo03FactoryMethodPattern;
//TODO Exemplo 02 Factory Method Pattern

public class TigerFactory2 extends AnimalFactory2{
    // Criando e retornando uma instância 'Tiger'

    @Override
    protected Animal2 createAnimal(String color) {
        return new Tiger2(color);
    }
}
