package Capitulo01DIP;
//TODO Demonstração 09 Implementação DIP (Principio da Inversão de Dependencia)
public class UserInterface {
    private OracleDatabase oracleDatabase;
    public UserInterface () {
        this.oracleDatabase = new OracleDatabase();
    }

    public void saveEmployeedId(String empId) {
        //Assuming that this is a valid data
        //So, storing it in the database
        oracleDatabase.saveEmpIdInDatabase(empId);
    }
}
