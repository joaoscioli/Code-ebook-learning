package capitulo09;

public interface MyIF {
    // Esta é uma declaração de método de interface "normal".
    // NÃO define uma implementação padrão.
    int getNumber();
    // Este é um método padrão. Observe que ele fornece
    // uma implementação padrão.
    default String getString() {
        return "Default String";
    }
}
