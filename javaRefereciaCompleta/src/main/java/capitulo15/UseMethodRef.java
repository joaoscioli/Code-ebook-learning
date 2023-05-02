package capitulo15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//TODO capitlo 15 expressoes lambdas Demonstracao 14

// Use uma referência de método para ajudar a encontrar o valor máximo em uma coleção.
public class UseMethodRef {

    // Um método compare() compatível com aquele definido por Comparator<T>.
    static int compareMC (MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<MyClass>();

        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));

        // Encontre o valor máximo em al usando o método compareMC().
        MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC);

        System.out.println("Maximun value is: " + maxValObj.getVal());
    }
}
