package Patterns.Factory.AbstractFactory;

interface IngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies [] createVeggies();
}
