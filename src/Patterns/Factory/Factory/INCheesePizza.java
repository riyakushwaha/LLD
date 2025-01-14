package Patterns.Factory.Factory;

class INCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing INDIA Patterns.Factory.Patterns.Factory.CheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking INDIA Patterns.Factory.Patterns.Factory.CheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting INDIA Patterns.Factory.Patterns.Factory.CheesePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing up INDIA Patterns.Factory.Patterns.Factory.CheesePizza");
    }
}
