package Patterns.Factory.SimpleFactory;

class VeggiePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Patterns.Factory.SimpleFactory.VeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Patterns.Factory.SimpleFactory.VeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Patterns.Factory.SimpleFactory.VeggiePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing up Patterns.Factory.SimpleFactory.VeggiePizza");
    }
}
