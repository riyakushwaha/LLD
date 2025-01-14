package Patterns.Factory.Factory;

class INVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing INDIAFactory.Patterns.Factory.VeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking INDIA Patterns.Factory.Patterns.Factory.VeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting INDIA Patterns.Factory.Patterns.Factory.VeggiePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing up INDIA Patterns.Factory.Patterns.Factory.VeggiePizza");
    }
}
