package capitulo09;
// Uma implementação do IntStack que usa armazenamento fixo.
public class FixedStack implements IntStack{
    private int [] stck;
    private int tos;
    // aloca e inicializa a pilha
    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }
    // Empurra um item para a pilha
    public void push(int item){
        if(tos==stck.length-1) // usa membro de comprimento
            System.out.println("Stack is full");
        else
            stck[++tos]=item;
    }
    // Retira um item da pilha
    public int pop(){
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

