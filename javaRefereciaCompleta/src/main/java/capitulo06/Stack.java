package capitulo06;
/*
* Esta classe define uma pilha de inteiros que pode conter 10 valores
* */
public class Stack {
    int[] stck = new int[10];
    int tos;
    Stack(){
        tos = -1;
    }
    // Empurra um item para a pilha
    void push(int item){
        if(tos==9)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }
    // Retira um item da pilha
    int pop(){
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}
