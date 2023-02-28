package capitulo07;
/*
*   Outro exemplo que usa recursão.
* */
public class RecTest {
    int[] values;
    RecTest(int i){
        values = new int[i];
    }
    // exibe array -- recursivamente
    void printArray(int i){
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "]" + values[i-1]);
    }
}
