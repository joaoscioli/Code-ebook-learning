//package Capitulo13;
//
////Demonstração do operador instanceof
//class A {
//    int i,j;
//}
//class B{
//    int i,j;
//}
//class C extends A{
//    int k;
//}
//class D extends A{
//    int k;
//}
//class instanceOf{
//    public static void main(String[] args) {
//        var a = new A();
//        var b = new B();
//        var c = new C();
//        var d = new D();
//        if (a instanceof A)
//            System.out.println("a is instance of A");
//        if (b instanceof B)
//            System.out.println("b is instance of B");
//        if (c instanceof C)
//            System.out.println("c is instence of C");
//        if (c instanceof A)
//            System.out.println("c is instance of A");
//        if (a instanceof C)
//            System.out.println("a is instance of C");
//        System.out.println();
//        // compara tipos de tipos derivados
//        A ob;
//        ob = d; //A recebe a referencia de d
//        System.out.println("ob now refers to d");
//        if (ob instanceof D)
//            System.out.println("ob is instance of D");
//        System.out.println();
//        ob = c; // A reference to c
//        System.out.println("ob now refers to c");
//        if(ob instanceof D)
//            System.out.println("ob can be cast to D");
//        else
//            System.out.println("ob cannot be cast to D");
//        if(ob instanceof A)
//            System.out.println("ob can be cast to A");
//        System.out.println();
//        // all objects can be cast to Object
//        if(a instanceof Object)
//            System.out.println("a may be cast to Object");
//        if(b instanceof Object)
//            System.out.println("b may be cast to Object");
//        if(c instanceof Object)
//            System.out.println("c may be cast to Object");
//        if(d instanceof Object)
//            System.out.println("d may be cast to Object");
//
//    }
//}