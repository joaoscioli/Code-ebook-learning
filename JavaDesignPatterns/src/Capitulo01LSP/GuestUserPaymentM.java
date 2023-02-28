package Capitulo01LSP;
//TODO Demonstração 06 Implementação LSP

public class GuestUserPaymentM implements NewPaymentM{
    String name;

    public GuestUserPaymentM() {
        this.name = "guest";
    }

    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "s current payment request.");
        //Some code, if any
    }
}
