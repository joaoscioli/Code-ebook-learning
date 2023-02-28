package capitulo07;
/*
*   Inferência de tipo de variável local com um tipo de classe definido pelo usuário.
* */
public class MyClass {
    private int i;
    MyClass(int k){ i = k;}
    int getI(){return i;}
    void setI(int k){
        if(k >= 0) i = k;
    }
}
