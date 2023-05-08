package Capitulo05PrototypePattern;
//TODO Demonstração 01 Prototype Pattern

//Client.java
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype Pattern Demo***\n");

        // Trabalhando com um carro Nano
        BasicCar nano = new Nano("Nano XM624 cc");
        System.out.println(nano);
        System.out.println("-------");

        // Obtendo uma versão clonada do Nano
        BasicCar clonedCar;
        clonedCar = nano.clone();
        // Trabalhando com o Nano clonado
        printCarDetail(clonedCar);
        System.out.println("-------\n");

        // Trabalhando com uma cópia do carro Ford
        BasicCar ford = new Ford("Ford Aspire");
        System.out.println(ford);
        System.out.println("-------");

        // Obtendo uma versão clonada do Ford
        clonedCar = ford.clone();
        // Trabalhando com o Ford clonado
        printCarDetail(clonedCar);
        System.out.println("-------\n");

    }
    private static void printCarDetail(BasicCar car) {
        System.out.println("Editing a cloned model:");
        System.out.println("Model: " + car.modelName);
        // Editando o preço on-road de um carro
        // Este é um passo opcional
        car.onRoadPrice += 1000;
        System.out.println("It's on-road price: $" + car.onRoadPrice);
    }
}
