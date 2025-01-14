package Patterns.Strategy.Example2;

public class MallardDuck extends Duck{

    MallardDuck(){
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Squeak();
    }
    @Override
    void display() {
        System.out.println("I am a mallard duck");
    }
}
