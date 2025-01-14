package Parking.payment;

public class Cash extends PaymentMethods {
    public boolean initiateTransaction(int amount) {
        // definition
        System.out.println("Paying by CASH amount "+ amount);
        return true;
    }
}
