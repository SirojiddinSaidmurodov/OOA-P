package Strategy.SuperStrategy;

import Strategy.SuperStrategy.QuackBehavior;

class Quack implements Strategy.SuperStrategy.QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
