package Capitulo01LSP;
//TODO Demonstração 06 Implementação LSP
public class RegisteredUserPaymentM implements NewPaymentM, PreviousPaymentM {
    String name;

    public RegisteredUserPaymentM(String userName) {
        this.name = userName;
    }
    @Override
    public void newPayment() {
        System.out.println("Processing " + name + "s current payment request");
        //Some code, if any
    }

    @Override
    public void previousPaymentInfo() {
        System.out.println("Retrieving " + name + "s last payment details.");
        //Some code, if any
    }
}
