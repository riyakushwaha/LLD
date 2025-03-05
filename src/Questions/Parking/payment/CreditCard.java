package Questions.Parking.payment;

public class CreditCard extends PaymentMethods {
    public boolean initiateTransaction(int amount) {
        // definition
        System.out.println("Paying by CREDIT CARD amount "+ amount);
        return true;
    }
}
