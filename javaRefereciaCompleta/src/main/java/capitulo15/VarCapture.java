package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 09

// Demonstra uma referência de método para um método estático.
public class VarCapture {
    public static void main(String[] args) {
        // Uma variável local que pode ser capturada.
        int num = 10;

        MyFunc myLambda = (n) -> {
            // Este uso de num está OK. Não modifica num.
            int v = num + n;

            // No entanto, o seguinte é ilegal porque tenta
            // para modificar o valor de num.
            // num++;
            return v;
        };
        // A linha a seguir também causaria um erro, porque
        // removeria o status efetivamente final de num.
        // num = 9;
    }
}
