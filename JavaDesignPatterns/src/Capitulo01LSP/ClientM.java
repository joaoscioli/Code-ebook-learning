package Capitulo01LSP;
//TODO Demonstração 06 Implementação LSP
//public class ClientM {
//    public static void main(String[] args) {
//        System.out.println("***A demo that follows the LSP***\n");
//        PaymentHelperM helper = new PaymentHelperM();
//        // Instantiating two registered users.
//        RegisteredUserPaymentM robin = new RegisteredUserPaymentM("Robin");
//        RegisteredUserPaymentM jack = new RegisteredUserPaymentM("Jack");
//        // Instantiating a guest users payment.
//        GuestUserPaymentM guestUser1 = new GuestUserPaymentM();
//        // Consolidating the previous payments info to the helper
//        helper.addPreviousPayment(robin);
//        helper.addPreviousPayment(jack);
//        // Consolidating new payment requests to the helper
//        helper.addNewPayment(robin);
//        helper.addNewPayment(jack);
//        helper.addNewPayment(guestUser1);
//        // Retrieve all the previous payments of registered users.
//        helper.showPreviousPayments();
//        // Process all new payment requests from all users.
//        helper.processNewPayments();
//    }
//}
