package capitulo09;
// Implementa uma pilha "aumentável".
public class DynStack {
    private int[] stck;
    private int tos;
// aloca e inicializa a pilha
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }
// Empurra um item para a pilha
    public void push(int item) {
// se a pilha estiver cheia, aloca uma pilha maior
        if(tos==stck.length-1) {
            int[] temp = new int[stck.length * 2]; // double size
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }
    // Retira um item da pilha
    public int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
