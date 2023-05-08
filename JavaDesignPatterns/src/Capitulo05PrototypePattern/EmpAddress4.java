package Capitulo05PrototypePattern;
//TODO Demonstração 04 Prototype Pattern

public class EmpAddress4 {
    String address;
    public EmpAddress4(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return this.address;
    }
    public EmpAddress4 cloneAddress() throws CloneNotSupportedException {
        // Copia rasa
        return (EmpAddress4) this.clone();
    }
}
