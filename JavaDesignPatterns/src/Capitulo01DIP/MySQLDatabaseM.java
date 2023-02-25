package Capitulo01DIP;
//TODO Demonstração 10 Implementação DIP (Principio da Inversão de Dependencia)

public class MySQLDatabaseM implements DatabaseM{
    @Override
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("The id " + empId + " is saved in the MySQL Database.");
    }
}
