package capitulo07;
/*
*   This program will not compile.
*/
public class Inner {
    int y = 10; //variavel local
    void display(){
        //System.out.println("display: outer_x: " + outer_x);
    }
}
//void showy(){
//    System.out.println(y);// erro, y não conhecido aqui!
//}