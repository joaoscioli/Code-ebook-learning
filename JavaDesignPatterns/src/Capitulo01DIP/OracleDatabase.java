package Capitulo01DIP;
//TODO Demonstração 09 Implementação DIP (Principio da Inversão de Dependencia)

public class OracleDatabase {
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("The id: " + empId + " is saved in the Oracle database.");
    }
}
