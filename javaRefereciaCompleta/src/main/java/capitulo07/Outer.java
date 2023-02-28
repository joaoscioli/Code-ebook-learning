package capitulo07;
/*
 * Define an inner class within a for loop.
 *
 */
public class Outer {
    int outer_x = 100;
    void test(){
        for (int i = 0; i < 10; i++){
            class Inner{
                void display(){
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
//    void test(){
//        Inner inner = new Inner();
//        inner.display();
//    }
}
// esta é uma classe interna

