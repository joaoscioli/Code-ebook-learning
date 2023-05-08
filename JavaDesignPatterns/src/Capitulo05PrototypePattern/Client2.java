package Capitulo05PrototypePattern;
//TODO Demonstração 02 Prototype Pattern

public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype Pattern Modified Demo***\n");
        CarMaker carMaker = new CarMaker();

        // Trabalhando com um carro Nano
        BasicCar nano = carMaker.getNano();
        System.out.println(nano);
        System.out.println("-------");

        // Obtendo uma versão clonada do Nano
        BasicCar clonedCar;
        clonedCar = nano.clone();
        // Trabalhando com o Nano clonado
        printCarDetail(clonedCar);

        System.out.println("-------\n");

        // Trabalhando com uma cópia do carro Ford
        BasicCar ford = carMaker.getFord();
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
        car.onRoadPrice += 100;
        System.out.println("Its on-road price: $" + car.onRoadPrice);
    }
}
