package Patterns.Strategy.Example1;

public class ShoppingCart {

    PaymentMethod paymentMethod;
    String [] items;
    int [] prices;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public void setPrices(int[] prices) {
        this.prices = prices;
    }

    private int getTotalPrice(){
        int sum = 0;
        for(int price: prices){
            sum+= price;
        }
        return sum;
    }

    public void checkout(){
        if(paymentMethod == null){
            System.out.println("Please set payment method!");
            return;
        }

        int amount = getTotalPrice();
        paymentMethod.pay(amount);
    }


}
