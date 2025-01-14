package Patterns.Factory.SimpleFactory;

public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("VeggiePizza");
    }
}