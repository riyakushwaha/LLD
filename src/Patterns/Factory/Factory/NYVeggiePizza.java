package Patterns.Factory.Factory;

class NYVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NewYork Patterns.Factory.Patterns.Factory.VeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking NewYork Patterns.Factory.Patterns.Factory.VeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NewYork Patterns.Factory.Patterns.Factory.VeggiePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing up NewYork Patterns.Factory.Patterns.Factory.VeggiePizza");
    }
}
