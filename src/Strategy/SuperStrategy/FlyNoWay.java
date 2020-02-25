package Strategy.SuperStrategy;

import Strategy.SuperStrategy.FlyBehavior;

class FlyNoWay implements Strategy.SuperStrategy.FlyBehavior {


    @Override
    public void fly() {
        System.out.println("Can't fly!");
    }
}
