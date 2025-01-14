package Patterns.Strategy.Example1;

public class Client {
    public static void main(String [] args){
        PaymentMethod creditCard = new CreditCard("John Doe",123, "12345", "05/31");
        PaymentMethod netBanking = new NetBanking("John Doe", "password");

        String [] items = {"pencil", "box"};
        int [] price= {10, 150};
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setItems(items);
        shoppingCart.setPrices(price);

        shoppingCart.checkout();

        shoppingCart.setPaymentMethod(creditCard);
        shoppingCart.checkout();

        shoppingCart.setPaymentMethod(netBanking);
        shoppingCart.checkout();
    }
}
