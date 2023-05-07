package capitulo19;
//TODO capitulo 19 Exploring java.lang Demonstracao 16

// Demonstra grupos de threads.
public class NewThread extends Thread {
    boolean suspendFlag;

    NewThread (String threadName, ThreadGroup tgOb) {
        super(tgOb, threadName);
        System.out.println("New thread: " + this);
        suspendFlag = false;
    }

    // Este é o ponto de entrada para thread.
    public void run () {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in " + getName());
        }
        System.out.println(getName() + " exiting.");
    }

    synchronized void mysuspend () {
        suspendFlag = true;
    }

    synchronized void myresume () {
        suspendFlag = false;
        notify();
    }
}
