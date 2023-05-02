package capitulo17;
//TODO capitulo 17 Switch Expressions, Records, and Other Recently Added Features Demonstracao 09

// Um exemplo simples de registro.

// Declara um registro de funcionário. Isso cria automaticamente um
// classe de registro com campos privados e finais chamados name e idNum,
// e com acessores somente leitura chamados name() e idNum().
//record Employee (String name, int idNum) {}

public class RecordDemo {

    public static void main(String[] args) {

        // Cria um array de registros Employee.
        Employee[] empList = new Employee[4];

        // Cria uma lista de funcionários que usa o registro Employee.
        // Observe como cada registro é construído. os argumentos
        // são atribuídos automaticamente aos campos name e idNum em
        // registro que está sendo criado.
        empList[0] = new Employee("Doe, John", 1047);
        empList[1] = new Employee("Jones, Robert", 1048);
        empList[2] = new Employee("Smith, Rachel", 1049);
        empList[3] = new Employee("Martin, Dave", 1050);

        // Use os acessadores de registro para exibir nomes e IDs.
        for (Employee e: empList)
            System.out.println("The employee ID for " + e.name() + " is " +
                                e.idNum());
    }
}
