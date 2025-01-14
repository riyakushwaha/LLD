package Patterns.Factory.Factory;

public class INPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type == "Veggie"){
            pizza = new INVeggiePizza();
        }else if(type == "Corn"){
            pizza = new INCornPizza();
        }else if(type == "Cheese"){
            pizza = new INCheesePizza();
        }
        return pizza;
    }
}
