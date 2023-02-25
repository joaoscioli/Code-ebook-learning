package Capitulo01SRP;
//TODO Demonstção 02 SRP ClientM

//public class ClientM {
//    public static void main(String[] args) {
//        System.out.println("***A demo that follows the SRP***");
//        EmployeeM robin = new EmployeeM("Robin","Smith", 7.5);
//        showEmpDetail(robin);
//        System.out.println("\n************\n");
//        EmployeeM kevin = new EmployeeM("Kevin","Proctor",3.2);
//        showEmpDetail(kevin);
//    }
//    private static void showEmpDetail(EmployeeM emp){
//        //Mostra os detalhes
//        emp.displayEmpDetail();
//        //Gerar um ID
//        EmployeeIdGeneratorM idGeneratorM = new EmployeeIdGeneratorM();
//        String empId = idGeneratorM.generateEmpId(emp.firstName);
//        System.out.println("The employee id: " + empId);
//        //Checar senioridade
//        SeniorityChecker seniorityChecker = new SeniorityChecker();
//        System.out.println(" This employee has: " +
//                seniorityChecker.checkSeniority(emp.experienceInYears) + " employee.");
//
//    }
//}
