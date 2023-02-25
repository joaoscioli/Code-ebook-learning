package Capitulo01LSP;

import java.util.ArrayList;
import java.util.List;

//TODO Demonstração 06 Implementação LSP
public class PaymentHelperM {
    List <PreviousPaymentM> previousPaymentM = new ArrayList<PreviousPaymentM>();
    List <NewPaymentM> newPaymentM = new ArrayList<NewPaymentM>();

    public void addPreviousPayment(PreviousPaymentM previousPayment) {
        previousPaymentM.add(previousPayment);
    }

    public void addNewPayment(NewPaymentM newPayment) {
        newPaymentM.add(newPayment);
    }

    public void showPreviousPayments() {
        for (PreviousPaymentM payment : previousPaymentM) {
            payment.previousPaymentInfo();
            System.out.println("------");
        }
    }

    public void processNewPayments() {
        for (NewPaymentM payment : newPaymentM) {
            payment.newPayment();
            System.out.println("*************");
        }
    }

}
