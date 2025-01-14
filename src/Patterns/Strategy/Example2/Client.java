package Patterns.Strategy.Example2;

public class Client {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.fly();;
        modelDuck.quack();
        modelDuck.swim();

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.fly();;
        mallardDuck.quack();

        //UPDATING IMPLEMENTATION
        mallardDuck.setFlyBehaviour(new FlyWithWings());
        mallardDuck.setQuackBehaviour(new MuteQuack());
        mallardDuck.display();
        mallardDuck.fly();;
        mallardDuck.quack();
    }
}
