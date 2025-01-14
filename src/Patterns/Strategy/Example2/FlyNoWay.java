package Patterns.Strategy.Example2;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
