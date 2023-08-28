package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 08

import java.util.Timer;

public class TTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();

        /* Define um atraso inicial de 1 segundo,
        depois repita a cada meio segundo.*/
        myTimer.schedule(myTask, 1000, 500);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException exc) { }

        myTimer.cancel();
    }
}
