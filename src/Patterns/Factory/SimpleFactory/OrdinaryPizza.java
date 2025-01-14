package Patterns.Factory.SimpleFactory;

class OrdinaryPizza implements  Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Patterns.Factory.SimpleFactory.OrdinaryPizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Patterns.Factory.SimpleFactory.OrdinaryPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Patterns.Factory.SimpleFactory.OrdinaryPizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing up Patterns.Factory.SimpleFactory.OrdinaryPizza");
    }
}
