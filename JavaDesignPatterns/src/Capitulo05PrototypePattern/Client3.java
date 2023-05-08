package Capitulo05PrototypePattern;
//TODO Demonstração 03 Prototype Pattern

//Client.java
public class Client3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Shallow vs Deep Copy Demo. ***\n");
        EmpAdddress initialAddress = new EmpAdddress("21, abc Road, USA");
        Employee emp = new Employee(1, "Jhon", initialAddress);

        System.out.println("The original object is emp which is as follows:");
        System.out.println(emp);

        System.out.println("\nMaking a clone of emp now.");
        Employee empClone = (Employee) emp.cloneEmployee();
        System.out.println("The empClone object is as follows:");
        System.out.println(empClone);

        System.out.println("\n--Changing the detail of the cloned object now.--");
        empClone.id = 10;
        empClone.name = "Sam";
        empClone.empAdddress.address = "123, xys Road Canada";
        System.out.println("\nNow the emp object is as follows:");
        System.out.println(emp);
        System.out.println("\nAnd the emp1Clone object is as follows:");
        System.out.println(empClone);
    }
}
