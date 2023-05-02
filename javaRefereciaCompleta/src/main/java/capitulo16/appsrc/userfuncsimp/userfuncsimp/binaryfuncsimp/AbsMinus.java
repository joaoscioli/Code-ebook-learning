package capitulo16.appsrc.userfuncsimp.userfuncsimp.binaryfuncsimp;
//TODO capitulo 16 modulos Demonstracao 02


import capitulo16.appsrc.userfuncs.userfuncs.binaryfuncs.BinaryFunc;
// AbsMinus fornece uma implementação concreta de
// BinaryFunc. Ele retorna o resultado de abs(a) - abs(b).
public class AbsMinus implements BinaryFunc {

    // Retorna o nome desta função.
    @Override
    public String getName() {
        return "absMinus";
    }

    // Implementa a função AbsMinus.
    @Override
    public int func(int a, int b) {
        return Math.abs(a) - Math.abs(b);
    }
}
