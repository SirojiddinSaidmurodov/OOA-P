package Strategy.SuperStrategy;

import Strategy.SuperStrategy.QuackBehavior;

class Quack implements Strategy.SuperStrategy.QuackBehavior {

    @Override
    public void performAction() {
        System.out.println("Quack!");

    }
}
