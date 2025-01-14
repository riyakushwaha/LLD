package Patterns.Adapter.Example1;

public class EcommercePlatform {
    private PaymentGateway paymentGateway;

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(String paymentDetails) {
        paymentGateway.processPayment(paymentDetails);
    }

    public static void main(String[] args) {
        EcommercePlatform platform = new EcommercePlatform();

        // Using PayPal
        PayPal payPal = new PayPal();
        PaymentGateway payPalAdapter = new PayPalAdapter(payPal);
        platform.setPaymentGateway(payPalAdapter);
        platform.checkout("Payment details for PayPal");

        // Using Stripe
        Stripe stripe = new Stripe();
        PaymentGateway stripeAdapter = new StripeAdapter(stripe);
        platform.setPaymentGateway(stripeAdapter);
        platform.checkout("Payment details for Stripe");
    }
}
