package capitulo09;
// Define uma interface de pilha de inteiros.
// Outra versão do IntStack que possui uma interface privada
// método que é usado por dois métodos padrão.
interface IntStack {
    void push(int item); // armazena um item
    int pop();//recupera um item
    // Como clear( ) tem um padrão, não precisa ser
    // implementado por uma classe preexistente que usa IntStack.
    default void clear() {
        System.out.println("clear() not implemented.");
    }
    // Este é um método de interface estática.
    static int getDefaultNumber() {
        return 0;
    }
    // Um método padrão que retorna um array que contém
    // os n primeiros elementos da pilha.
    default int[] popNElements(int n) {
    // Retorna os elementos solicitados.
    return getElements(n);
    }
    // Um método padrão que retorna um array que contém
    // os próximos n elementos na pilha após pular elementos.
    default int[] skipAndPopNElements(int skip, int n) {
    // Ignora o número especificado de elementos.
    getElements(skip);
    // Retorna os elementos solicitados.
    return getElements(n);
    }
    // Um método privado que retorna um array contendo
    // os n primeiros elementos da pilha
    private int[] getElements(int n) {
        int[] elements = new int[n];
        for(int i=0; i < n; i++) elements[i] = pop();
        return elements;
    }




}
