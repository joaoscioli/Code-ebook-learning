package Capitulo05PrototypePattern;
//TODO Demonstração 03 Prototype Pattern

//EmpAddress
public class EmpAdddress implements Cloneable{
    String address;

    public EmpAdddress (String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.address;
    }

    public EmpAdddress cloneAddress() throws CloneNotSupportedException {
        // Cópia rasa
        return (EmpAdddress) this.clone();
    }
}
