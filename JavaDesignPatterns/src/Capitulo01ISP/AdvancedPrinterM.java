package Capitulo01ISP;
//TODO Demonstração 08 Implementação ISP (Principio da Segregação de Interface)
public class AdvancedPrinterM implements PrinterM, FaxDevice {
    @Override
    public void printDocument() {
        System.out.println("The advanced printer prints a Document.");
    }

    @Override
    public void sendFax() {
        System.out.println("The advanced printer sends a fax");
    }
}
