package capitulo08;
/*
*   Cria uma subclasse estendendo a classe A.
*   O j de A não está acessível aqui. Up01
*   Usando super para superar a ocultação de nomes UP02
*   Sobreposição do método. UP03
*   Métodos com assinaturas de tipo diferentes estão sobrecarregados – não. substituído. UP04
*
* */
//public class B extends A {
//    // override callme()
//    void callme() {
//        System.out.println("Inside B's callme method");
//    }
//
//}
    //UP05
/*
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // display k – this overrides show() in A
    void show(String msg) {
        System.out.println(msg + k);
    }
}
*/

//UP03
/*
    int i;  // este i esconde o i em A
    B(int a, int b){
        super.i = a; //i de A
        i = b; //i de B
    }

    B() {
        System.out.println("Inside B's constructor.");
    }


    void show(){
        System.out.println("i da super classe A: " + super.i);
        System.out.println("i da sub classe B: " + i);
    }
}
*/
//UP 02
//    int total;
//     void sum(){
//        //total= i + j; // ERROR, j is not accessible here
//     }
//}


//    int k;
//    void showk(){
//        System.out.println("Valor de k: " + k);
//    }
//    void sum(){
//        System.out.println("i + j + k: " + (i + j + k));
//    }
//}
