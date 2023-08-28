package capitulo21;
//TODO capitulo 21 java.util Part 2: More Utility Classesjava.util Demonstracao 08

//Demonstração das classes Timer e TimerTask
import java.util.*;

public class MyTimerTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("Timer task executed.");
    }
}
