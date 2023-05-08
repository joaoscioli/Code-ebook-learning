package Capitulo05PrototypePattern;
//TODO Demonstração 04 Prototype Pattern

public class CopyConstructorDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***A simple copy constructor demo***\n");
        EmpAddress4 initialAddress = new EmpAddress4("21, abc Road, USA");
        Employee4 emp = new Employee4(1, "Jhon", initialAddress);
        System.out.println("The original object is emp which is as follows:");
        System.out.println(emp);
        System.out.println("\n Copying from emp to empCopy now.");
        Employee4 empCopy = new Employee4(emp);
        System.out.println("The empCopy object is as follows:");
        System.out.println(empCopy);
        System.out.println("\n--Changing the detail of the copied object now.--");
        empCopy.id = 10;
        empCopy.name = "Sam";
        empCopy.empAddress.address = "123, xyz Road, Canada";

        System.out.println("\nNow the emp object is as follows:");
        System.out.println(emp);
        System.out.println("\nAnd the empCopy object is as follows:");
        System.out.println(empCopy);
    }
}
