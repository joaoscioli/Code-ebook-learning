package Capitulo01DIP;
//TODO Demonstração 10 Implementação DIP (Principio da Inversão de Dependencia)
public class UserInterfaceM {
    DatabaseM database;
    public UserInterfaceM(DatabaseM database) {
        this.database = database;
    }

    public void saveEmployeeId(String empId) {
        database.saveEmpIdInDatabase(empId);
    }
}
