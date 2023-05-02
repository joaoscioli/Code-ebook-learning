//package capitulo17;
////TODO capitulo 17 Switch Expressions, Records, and Other Recently Added Features Demonstracao 11
//
//// Use um construtor não canônico em um registro.
//
//// Declara um registro de funcionário que declara explicitamente ambos
//// um construtor canônico e não canônico.
//record Employee (String name, int idNum) {
//
//    // Use um campo estático em um registro.
//    private static final int pendingID = -1;
//    static int pandingID = -1;
//
//    // Use um construtor canônico compacto para remover qualquer entrelinha e
//    // espaços à direita da string de nome.
//    public Employee {
//        // Remova todos os espaços iniciais e finais.
//        name = name.trim();
//    }
//
//    // Este é um construtor não canônico. Observe que é
//    // não passou um número de ID. Em vez disso, ele passa o pendingID para o
//    // construtor canônico para criar o registro.
//    public Employee (String name) {
//        this(name, pendingID);
//    }
//}
//
//public class RecordDemo3 {
//    public static void main(String[] args) {
//        Employee[] empList = new Employee[4];
//
//        // Cria uma lista de funcionários que usa o registro Employee.
//        empList[0] = new Employee("Doe, John", 1047);
//        empList[1] = new Employee("Jones, Robert", 1048);
//        empList[2] = new Employee("Smith, Rachel", 1049);
//
//        // Aqui, o número de identificação está pendente.
//        empList[3] = new Employee("Martin, Dave");
//
//        // Exibir nomes e IDs.
//        for (Employee e : empList) {
//            System.out.print("The employee ID for " + e.name() + " is ");
//            if (e.idNum() == Employee.pandingID) System.out.println("Pending");
//            else System.out.println(e.idNum());
//        }
//
//    }
//}
