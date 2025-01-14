package Patterns.Strategy.Example1;

public class CreditCard implements PaymentMethod{
    String name;
    int cvv;
    String cardNumber;
    String dateOfExpiry;

    public CreditCard(String name, int cvv, String cardNumber, String dateOfExpiry) {
        this.name = name;
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount){
        System.out.println("Paid $"+amount+" via CreditCard");
    }
}
