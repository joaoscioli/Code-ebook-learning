package capitulo07;
/*
* Demonstrar a sobrecarga de métodos.
* As conversões automáticas de tipo aplicam-se à sobrecarga.
* */
public class OverloadDemo {
    void test(){
        System.out.println("Sem Parametros");
    }
    // Teste de sobrecarga para um parâmetro inteiro.
//    void test(int a){
//        System.out.println("a: " + a);
//    }
    // Teste de sobrecarga para dois parâmetros inteiros.
    void test(int a, int b){
        System.out.println("a: " + a + " b: " + b);
    }
    // Teste de sobrecarga para um parâmetro duplo
    double test(double a){
        System.out.println("double a: " + a);
        return a * a;
    }
}
