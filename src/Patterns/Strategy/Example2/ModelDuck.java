package Patterns.Strategy.Example2;

public class ModelDuck extends Duck{
    ModelDuck(){
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    @Override
    void display() {
        System.out.println("I am a model duck.");
    }
}
