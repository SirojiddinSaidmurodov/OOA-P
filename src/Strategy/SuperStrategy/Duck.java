package Strategy.SuperStrategy;

import Strategy.SuperStrategy.FlyBehavior;
import Strategy.SuperStrategy.QuackBehavior;

abstract class Duck {
    Strategy.SuperStrategy.FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    void setFlyBehavior(Strategy.SuperStrategy.FlyBehavior fly) {
        this.flyBehavior = fly;
    }

    void setQuackBehavior(QuackBehavior quack) {
        this.quackBehavior = quack;
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void swim() {
        System.out.println("Swimming");
    }

    abstract void display();

    void performFly() {
        flyBehavior.fly();
    }
}
