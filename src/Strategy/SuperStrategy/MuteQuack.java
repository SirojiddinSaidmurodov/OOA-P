package Strategy.SuperStrategy;

import Strategy.SuperStrategy.QuackBehavior;

class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Can't quack!");
    }
}
