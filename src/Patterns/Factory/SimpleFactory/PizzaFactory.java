package Patterns.Factory.SimpleFactory;

 class PizzaFactory {

    public static Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("CheesePizza")){
            pizza = new CheesePizza();
        }else if(type.equals("VeggiePizza")){
            pizza = new VeggiePizza();
        }else{
            pizza = new OrdinaryPizza();
        }

        return pizza;
    }
}
