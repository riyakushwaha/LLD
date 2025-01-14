package Patterns.Factory.Factory;

public class Client {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("Veggie");

        PizzaStore inPizzaStore = new INPizzaStore();
        inPizzaStore.orderPizza("Corn");
    }
}
