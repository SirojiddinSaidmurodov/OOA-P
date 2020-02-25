package Strategy.SuperStrategy;

import Strategy.SuperStrategy.FlyBehavior;

class FlyRocketPowered implements Strategy.SuperStrategy.FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with a rocket!");
    }
}
