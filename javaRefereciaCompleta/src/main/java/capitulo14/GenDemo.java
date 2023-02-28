//package capitulo14;
//// Demonstra a classe genérica.
//public class GenDemo {
//    public static void main(String[] args) {
//        // Cria uma referência Gen para Integers.
//        Gen<Integer> iOb;
//        // Cria um objeto Gen<Integer> e atribui seu
//        // referência a iOb. Observe o uso de autoboxing
//        // para encapsular o valor 88 dentro de um objeto Integer.
//        iOb =new Gen<Integer>(88);
//        // Mostra o tipo de dado usado pelo iOb.
//        iOb.showType();
//        // Obtém o valor em iOb. Notar que
//        // nenhuma conversão é necessária.
//        int v = iOb.getOb();
//        System.out.println("value: " + v);
//        System.out.println();
//        // Cria um objeto Gen para Strings.
//        Gen<String> strOb = new Gen<String>("Generics Test");
//        // Mostra o tipo de dado usado por strOb.
//        strOb.showType();
//        // Obtém o valor de strOb. Mais uma vez, observe
//        // que nenhuma conversão é necessária.
//        String str = strOb.getOb();
//        System.out.println("value: " + str);
//    }
//}
