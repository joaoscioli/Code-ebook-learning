package Capitulo01ISP;
//TODO Demonstação 07 Implementação ISP (Principio da Segregação de Interface)
public class BasicPrinter implements Printer{
    @Override
    public void printDocument() {
        System.out.println("The basic printer prints a Document");
    }

    @Override
    public void sendFax() {
        throw new UnsupportedOperationException();
    }
}
