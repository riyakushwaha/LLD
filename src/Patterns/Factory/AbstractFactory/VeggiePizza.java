package Patterns.Factory.AbstractFactory;

public class VeggiePizza extends Pizza{
    IngredientFactory ingredientFactory;

    VeggiePizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing...");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }
}
