package capitulo07;
/*
* Esta classe define uma pilha de inteiros que pode conter 10 valores.
* Agora, tanto stck quanto tos são privados. Isso significa que eles
* não podem ser alterados de forma acidental ou maliciosa de uma forma
* que possa prejudicar a pilha.
* Improved Stack class that uses the length array member.UP 01

 * */
public class Stack {
    //private int[] stck = new int[10];
    private int[] stck;
    private int tos;
    // Inicializa o topo da pilha
    Stack(){
        tos = - 1;
    }
    Stack(int size){
        stck = new int[size];
        tos = -1 ;
    }
    // Empurra um item para a pilha
    void push(int item){
        if (tos == stck.length-1 ) // use length member
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }
//    void push(int item){
//        if (tos == 9)
//            System.out.println("Stack is full");
//        else
//            stck[++tos] = item;
//    }
    // Retira um item da pilha
    int pop(){
        if (tos < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }

}
