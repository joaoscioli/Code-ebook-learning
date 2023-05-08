package Capitulo05PrototypePattern;
//TODO Demonstração 04 Prototype Pattern

public class Employee4 implements Cloneable {
    int id;
    String name;
    EmpAddress4 empAddress;

    public Employee4 (int id, String name, EmpAddress4 empAddress) {
        this.id = id;
        this.name = name;
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        String empDetail = null;
        empDetail = "Employee detail: Id: " + id + " Name: " + name + " Address: " + empAddress;
        return empDetail;
    }

    //Copia o Construtor
    public Employee4 (Employee4 originalEmployee) throws CloneNotSupportedException {
        this.id = originalEmployee.id;
        this.name = originalEmployee.name;
        this.empAddress = originalEmployee.empAddress.cloneAddress();
    }
}
