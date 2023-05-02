package capitulo16.appsrc.appstart.appstart.mymodappdemo;
import capitulo16.appsrc.appfuncs.appfuncs.simplefuncs.SimpleMathFuncs;

//TODO capitulo 16 modulos Demonstracao 01

// Demonstra um aplicativo simples baseado em módulo.
public class MyModAppDemo {
    public static void main(String[] args) {
        if (SimpleMathFuncs.isFactor(2, 10))
            System.out.println("2 is a factor of 10");

        System.out.println("Smallest factor common to both 35 and 105 is " +
                            SimpleMathFuncs.lcf(35, 105));

        System.out.println("Largest factor common to both 35 and 105 is " +
                            SimpleMathFuncs.gcf(35, 105));
    }
}
