package capitulo17;
//TODO capitulo 17 Switch Expressions, Records, and Other Recently Added Features Demonstracao 10

// Use um construtor de registro compacto.

// Declara um registro de funcionário.
//record Employee (String name, int idNum) {
//
//    // Use um construtor canônico compacto para remover qualquer entrelinha e
//    // espaços à direita da string de nome.
//    public Employee {
//        // Remova todos os espaços iniciais e finais.
//        name = name.trim();
//    }
//}

public class RecordDemo2 {
    public static void main(String[] args) {
        Employee[] empList = new Employee[4];

        // Aqui, o nome não tem espaços iniciais ou finais.
        empList[0] = new Employee("Doe, Jhon", 1047);

        // Os próximos três nomes têm espaços iniciais e/ou finais.
        empList[1] = new Employee("    Jones, Robert" , 1048);
        empList[2] = new Employee("Smith, Rachel  ", 1049);
        empList[3] = new Employee("     Martin, Dave    ", 1050);

        // Use os acessadores de registro para exibir nomes e IDs.
        // Observe que todos os espaços iniciais e/ou finais foram
        // removido do componente de nome pelo construtor.
        for (Employee e : empList)
            System.out.println("The employee ID for " + e.name() + " is " +
                                e.idNum());
    }
}
