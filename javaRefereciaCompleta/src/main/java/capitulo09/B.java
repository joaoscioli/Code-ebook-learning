package capitulo09;
// B implements the nested interface.
public class B implements A.NestedIF{
    public boolean isNotNegative(int x) {
        return x < 0 ? false: true;
    }
}
