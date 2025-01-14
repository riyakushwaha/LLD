package Patterns.Adapter.Example1;

public class StripeAdapter implements PaymentGateway {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(String paymentDetails) {
        stripe.makePayment(paymentDetails);
    }
}
