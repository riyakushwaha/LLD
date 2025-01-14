package Patterns.Factory.Factory;

class NYCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing NewYork Patterns.Factory.Patterns.Factory.CheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking NewYork Patterns.Factory.Patterns.Factory.CheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NewYork Patterns.Factory.Patterns.Factory.CheesePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing up NewYork Patterns.Factory.Patterns.Factory.CheesePizza");
    }
}
