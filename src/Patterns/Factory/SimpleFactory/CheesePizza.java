package Patterns.Factory.SimpleFactory;

class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Patterns.Factory.SimpleFactory.CheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Patterns.Factory.SimpleFactory.CheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Patterns.Factory.SimpleFactory.CheesePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing up Patterns.Factory.SimpleFactory.CheesePizza");
    }
}
