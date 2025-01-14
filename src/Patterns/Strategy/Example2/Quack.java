package Patterns.Strategy.Example2;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
