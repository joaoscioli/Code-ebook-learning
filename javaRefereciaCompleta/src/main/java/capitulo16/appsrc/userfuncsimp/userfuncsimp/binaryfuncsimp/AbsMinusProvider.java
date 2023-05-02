package capitulo16.appsrc.userfuncsimp.userfuncsimp.binaryfuncsimp;
//TODO capitulo 16 modulos Demonstracao 02

import capitulo16.appsrc.userfuncs.userfuncs.binaryfuncs.BinFuncProvider;
import capitulo16.appsrc.userfuncs.userfuncs.binaryfuncs.BinaryFunc;

// Este é um provedor para a função AbsMinus.
public class AbsMinusProvider implements BinFuncProvider {

    // Fornece um objeto AbsMinus.
    @Override
    public BinaryFunc get() {
        return new AbsMinus();
    }
}
