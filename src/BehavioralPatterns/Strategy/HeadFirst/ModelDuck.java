package BehavioralPatterns.Strategy.HeadFirst;

class ModelDuck extends Duck {
    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("I'm model duck!");
    }
}
