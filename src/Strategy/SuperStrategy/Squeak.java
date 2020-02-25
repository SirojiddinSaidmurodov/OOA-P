package Strategy.SuperStrategy;

import Strategy.SuperStrategy.QuackBehavior;

class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
