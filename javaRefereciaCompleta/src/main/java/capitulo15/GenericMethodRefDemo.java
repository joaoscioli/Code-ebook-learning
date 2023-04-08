package capitulo15;
//TODO capitlo 15 expressoes lambdas Demonstracao 13


// Demonstra uma referência de método para um método genérico
// Este método possui a interface funcional MyFunc como
// tipo de seu primeiro parâmetro. Os outros dois parâmetros
// recebe um array e um valor, ambos do tipo T.
class GenericMethodRefDemo {

    static <T> int myOp(MyFunc2<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }


    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"One", "Two", "Three", "Two"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("vals contains " + count + " 4s");

        count = myOp(MyArrayOps::<String>countMatching, strs, "Two");
        System.out.println("strs contains " + count + " Twos");
    }

}
