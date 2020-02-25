package Strategy.SuperStrategy;

import Strategy.SuperStrategy.Duck;
import Strategy.SuperStrategy.FlyWithWings;
import Strategy.SuperStrategy.Quack;

class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("Mallard");
    }
}
