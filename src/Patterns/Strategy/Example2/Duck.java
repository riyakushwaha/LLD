package Patterns.Strategy.Example2;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    abstract void display();

    void fly(){
        flyBehaviour.fly();
    }

    void quack(){
        quackBehaviour.quack();
    }

    void swim(){
        System.out.println("I am swimming!!");
    }
}
