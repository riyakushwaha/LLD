package Parking.payment;


public class Payment {

    private PaymentMethods paymentMethods;

    public Payment(PaymentMethods paymentMethods){
        this.paymentMethods = paymentMethods;
    }

    public boolean initiateTransaction(int amount){
        paymentMethods.initiateTransaction(amount);
        return true;
    };

}




