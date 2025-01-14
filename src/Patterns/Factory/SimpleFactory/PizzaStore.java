package Patterns.Factory.SimpleFactory;

 class PizzaStore {
    PizzaFactory pizzaFactory;

    PizzaStore(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza =  pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
}
