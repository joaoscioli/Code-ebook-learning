package Capitulo05PrototypePattern;
//TODO Demonstração 03 Prototype Pattern

//Employee
public class Employee implements Cloneable{
    int id;
    String name;
    EmpAdddress empAdddress;

    public Employee (int id, String name, EmpAdddress empAdddress) {
        this.id = id;
        this.name = name;
        this.empAdddress = empAdddress;
    }

    @Override
    public String toString() {
        String empDetail = null;
        empDetail = "Employee detail: id: " + id + " Name: " + name + " Address: " + empAdddress;
        return empDetail;
    }

    public Employee cloneEmployee() throws CloneNotSupportedException {
        // Para a cópia rasa
        return (Employee) this.clone();
        // Para a cópia profunda
        // Employee employee = (Employee) this.clone();
        // employee.empAddress = (EmpAddress) this.empAddress.
        // cloneAddress();
        // return employee;
    }
}
