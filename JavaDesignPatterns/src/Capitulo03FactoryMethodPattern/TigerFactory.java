package Capitulo03FactoryMethodPattern;
//TODO Exemplo 01 Factory Method Pattern

// A classe TigerFactory é usada para criar tigres
public class TigerFactory extends AnimalFactory{
    // Criando e retornando uma instância 'Tiger'
    @Override
    protected Animal createAnimal() {
        return new Tiger();
    }
}
