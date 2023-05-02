package capitulo16.appsrc.userfuncs.userfuncs.binaryfuncs;
//TODO capitulo 16 modulos Demonstracao 02

// Essa interface define uma função que leva dois int
// argumentos e retorna um resultado int. Assim, pode
// descreve qualquer operação binária em dois ints que
// retorna um int.
public interface BinaryFunc {
    // Obtém o nome da função.
    public String getName ();

    // Esta é a função a ser executada. Será
    // fornecido por implementações específicas.
    public int func (int a, int b);
}
