package Strategy.SuperStrategy;

import Strategy.SuperStrategy.FlyBehavior;

class FlyRocketPowered implements Strategy.SuperStrategy.FlyBehavior {

    @Override
    public void move() {
        System.out.println("Flying with a rocket!");
    }
}
