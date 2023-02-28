package capitulo08;
/*
* Um exemplo simples de herança.
* Criar uma superclasse
* Em uma hierarquia de classes, os membros privados permanecem UP 01
* privado de sua classe.
* Este programa contém um erro e não  compilar.
* Usando super para superar a ocultação de nomes UP02
* Demonstrar quando os construtores são executados. UP03
* Crie uma superclasse.
* Sobreposição do método.
* Dynamic Method Dispatch UP04
* */
//public class A {
//    void callme() {
//        System.out.println("Inside A's callme method");
//    }
//}
    //UP04
/*
    int i, j;
    A(int a, int b) {
        i = a;
        j = b;
    }
    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
*/
    //UP03
/*
    //int i, j;
    int i; //Default Access
    private int j; //private to A

    A() {
        System.out.println("Inside A's constructor.");
    }


    void setij(int x,int y){
        i = x;
        j = y;
    }
*/

//    void showij(){
//        System.out.println("valor de i: " + i + "valor de j: " + j);
//    }

