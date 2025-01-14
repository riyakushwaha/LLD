package Patterns.Factory.AbstractFactory;

public class INIngredientFactory implements IngredientFactory{
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new ParmesanCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Mushroom()};
        return veggies;
    }
}
