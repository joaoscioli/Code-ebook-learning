package Capitulo01OCP;

import java.util.ArrayList;
import java.util.List;
//TODO Demonstração 04 OCP APLICADO

//public class ClientM {
//    public static void main(String[] args) {
//        System.out.println("***** A demo that follows the OCP *****");
//        List<StudentM> scienceStudents = enrollScienceStudent();
//        List<StudentM> artsStudents = enrollArtsStudent();
//        //Mostra os resultados
//        System.out.println("======Results=====");
//        for (StudentM student : scienceStudents){
//            System.out.println(student);
//        }
//        for (StudentM student : artsStudents){
//            System.out.println(student);
//        }
//        //Evaluate distinctions
//        DistinctionDeciderM scienceDistinctionDecider =
//                new ScienceDistinctionDeciderM();
//        DistinctionDeciderM artsDistinctionDecider =
//                new ArtsDistinctionDeciderM();
//        System.out.println("====Distinction====");
//        for (StudentM student : scienceStudents){
//            scienceDistinctionDecider.evaluateDistinction(student);
//        }
//        for (StudentM student : artsStudents){
//            artsDistinctionDecider.evaluateDistinction(student);
//        }
//    }
//    private static List<StudentM> enrollScienceStudent(){
//        StudentM sam = new ScienceStudentM("Sam" , "R1" , 81.5 , "Comp.Sc.");
//        StudentM bob = new ScienceStudentM("Bob" , "R2" , 72 , "Physics");
//        List<StudentM> scienceStudents = new ArrayList<StudentM>();
//        scienceStudents.add(sam);
//        scienceStudents.add(bob);
//        return scienceStudents;
//    }
//
//    private static List<StudentM> enrollArtsStudent(){
//        StudentM john = new ArtsStudentM("John" , "R3" , 71 , "History");
//        StudentM kate = new ArtsStudentM("Kate" , "R3" , 66.5 , "English");
//        List<StudentM> artsStudents = new ArrayList<StudentM>();
//        artsStudents.add(john);
//        artsStudents.add(kate);
//        return artsStudents;
//    }
//}
