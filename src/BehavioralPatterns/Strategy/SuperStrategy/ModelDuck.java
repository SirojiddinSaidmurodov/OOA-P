package BehavioralPatterns.Strategy.SuperStrategy;

class ModelDuck extends BehavioralPatterns.Strategy.SuperStrategy.Duck {
    ModelDuck() {
        motion = new FlyNoWay();
        action = new BehavioralPatterns.Strategy.SuperStrategy.MuteQuack();
    }

    void display() {
        System.out.println("I'm model duck!");
    }
}
