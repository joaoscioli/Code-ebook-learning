package capitulo07;
/*
*   Objetos podem ser passados para métodos.
*   Tipos primitivos são passados por valor Up01
*   Os objetos são passados por suas referências Up02
*   Retornando um objeto Up 03
*   Este programa demonstra a diferença entre o público e o privado Up 04
* */
public class Test {
    int a; // default access
    public int b; // public access
    private  int c; //private access

    // métodos para acessar c
    public void setC(int i) {// define o valor de c
        this.c = i;
    }

    public int getC(){ //pega o valor de c
        return this.c;
    }

    Test(int i, int j){
        this.a = i;
        this.b = j;
    }
    Test (int i){
        a = i;
    }
    Test incrByTen(){
        Test temp = new Test(a + 10);
        return temp;
    }
    Test(){}
    //passa um objeto
    Test(Test o){
        o.a *= 2;
        o.b /= 2;
    }
    // retorna true se o for igual ao objeto invocado
    boolean igualTo(Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }
    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}
