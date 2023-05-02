package capitulo16.appsrc.userfuncs.userfuncs.binaryfuncs;
//TODO capitulo 16 modulos Demonstracao 02

// Esta interface define a forma de um provedor de serviço que
// obtém instâncias de BinaryFunc.
public interface BinFuncProvider {
    // Obtém um BinaryFunc.
    public BinaryFunc get();
}
