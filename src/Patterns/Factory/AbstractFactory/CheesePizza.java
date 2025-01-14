package Patterns.Factory.AbstractFactory;

public class CheesePizza extends Pizza{
    IngredientFactory ingredientFactory;

    CheesePizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing...");
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
