package Strategy.SuperStrategy;

import Strategy.SuperStrategy.FlyBehavior;

class FlyWithWings implements Strategy.SuperStrategy.FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with wings!");
    }
}
