package Patterns.Adapter.Example1;

public class PayPalAdapter implements PaymentGateway {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(String paymentDetails) {
        payPal.sendPayment(paymentDetails);
    }
}
