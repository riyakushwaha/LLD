package Patterns.Strategy.Example2;

public class FlyWithWings implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I am flying!!");
    }
}
