package Patterns.Strategy.Example2;

public class Squeak implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
