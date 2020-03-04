package Strategy.SuperStrategy;

class ModelDuck extends Strategy.SuperStrategy.Duck {
    ModelDuck() {
        motion = new FlyNoWay();
        action = new Strategy.SuperStrategy.MuteQuack();
    }

    void display() {
        System.out.println("I'm model duck!");
    }
}
