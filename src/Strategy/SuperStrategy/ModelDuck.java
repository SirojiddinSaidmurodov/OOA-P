package Strategy.SuperStrategy;

import Strategy.SuperStrategy.Duck;
import Strategy.SuperStrategy.FlyNoWay;
import Strategy.SuperStrategy.MuteQuack;

class ModelDuck extends Strategy.SuperStrategy.Duck {
    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Strategy.SuperStrategy.MuteQuack();
    }

    @Override
    void display() {
        System.out.println("I'm model duck!");
    }
}
