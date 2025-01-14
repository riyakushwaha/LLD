package Patterns.Adapter.Example1;

public class Stripe {
    public void makePayment(String paymentDetails) {
        System.out.println("Processing payment with Stripe: " + paymentDetails);
    }
}
