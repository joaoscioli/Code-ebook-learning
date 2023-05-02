package capitulo16.appsrc.appstart.appstart.mymodappdemo;
//TODO capitulo 16 modulos Demonstracao 02

import capitulo16.appsrc.appfuncs.appfuncs.simplefuncs.SimpleMathFuncs;
import capitulo16.appsrc.userfuncs.userfuncs.binaryfuncs.BinFuncProvider;
import capitulo16.appsrc.userfuncs.userfuncs.binaryfuncs.BinaryFunc;

import java.security.Provider;
import java.util.ServiceLoader;

// Um aplicativo baseado em módulo que demonstra serviços
// e provedores de serviços.
public class MyModAppDemo2 {
    public static void main(String[] args) {

        // Primeiro, use as funções integradas como antes.
        if (SimpleMathFuncs.isFactor(2, 10))
            System.out.println("2 is a factor of 10");

        System.out.println("Smallest factor common to both 35 and 105 is " +
                            SimpleMathFuncs.lcf(35, 105));
        System.out.println("Largest factor common to both 35 and 105 is " +
                            SimpleMathFuncs.gcf(35, 105));
        // Agora, use operações definidas pelo usuário baseadas em serviço.
        // Obtenha um carregador de serviço para funções binárias.
        ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);

        BinaryFunc binOp = null;

        // Encontre o provedor para absPlus e obtenha a função.
        for (BinFuncProvider bfp : ldr) {
            if (bfp.get().getName().equals("absPlus")) {
                binOp = bfp.get();
                break;
            }
        }

        if (binOp != null)
            System.out.println("Result of absPlus function: " +
                                binOp.func(12, -4));
        else
            System.out.println("Abs function not found");

        binOp = null;

        // Agora, encontre o provedor para absMinus e obtenha a função.
        for (BinFuncProvider bfp : ldr) {
            if (bfp.get().getName().equals("absMinus")) {
                binOp = bfp.get();
                break;
            }
        }

        if (binOp != null)
            System.out.println("Result of absMinus function: " +
                                binOp.func(12, -4));
        else
            System.out.println("absMinus function not found");
    }

}
