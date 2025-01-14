package Patterns.Factory.AbstractFactory;

class INPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        IngredientFactory ingredientFactory =
                new INIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        }
        return pizza;
    }
}
