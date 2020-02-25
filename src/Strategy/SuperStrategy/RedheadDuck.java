package Strategy.SuperStrategy;

import Strategy.SuperStrategy.Duck;
import Strategy.SuperStrategy.FlyWithWings;
import Strategy.SuperStrategy.Squeak;

class RedheadDuck extends Duck {
    RedheadDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm really redhead duck!");
    }
}
