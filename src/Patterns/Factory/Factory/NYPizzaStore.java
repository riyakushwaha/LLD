package Patterns.Factory.Factory;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type == "Veggie"){
            pizza = new NYVeggiePizza();
        }else if(type == "Corn"){
            pizza = new NYCornPizza();
        }else if(type == "Cheese"){
            pizza = new NYCheesePizza();
        }
        return pizza;
    }
}
