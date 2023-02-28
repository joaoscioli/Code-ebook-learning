//package capitulo14;
//// Demonstração da classe non-generic.
//public class NonGenDemo {
//    public static void main(String[] args) {
//        NonGen iOb;
//        // Cria um objeto NonGen e armazena
//        // um Integer nele. Autoboxing ainda ocorre.
//        iOb = new NonGen(88);
//        // Mostra o tipo de dado usado pelo iOb.
//        iOb.showType();
//        // Obtém o valor de iOb.
//        // Desta vez, uma conversão é necessária.
//        int v = (Integer) iOb.getOb();
//        System.out.println("value: " + v);
//        System.out.println();
//        // Cria outro objeto NonGen e
//        // armazena uma String nele.
//        NonGen strOb = new NonGen("Non-Generics Test");
//        // Mostra o tipo de dado usado por strOb.
//        strOb.showType();
//        // Obtém o valor de strOb.
//        // Novamente, observe que uma conversão é necessária.
//        String str = (String) strOb.getOb();
//        System.out.println("value: " + str);
//        // Isso compila, mas está conceitualmente errado!
//        iOb = strOb;
//        v = (Integer) iOb.getOb();//run time-error
//    }
//}
