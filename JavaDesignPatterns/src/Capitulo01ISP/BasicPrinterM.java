package Capitulo01ISP;
//TODO Demonstração 08 Implementação ISP (Principio da Segregação de Interface)
public class BasicPrinterM implements PrinterM {
    @Override
    public void printDocument() {
        System.out.println("The basic printer prints a document.");
    }
}
