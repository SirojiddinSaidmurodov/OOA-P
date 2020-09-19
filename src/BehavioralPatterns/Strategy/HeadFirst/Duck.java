package BehavioralPatterns.Strategy.HeadFirst;

abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    void setFlyBehavior(FlyBehavior fly) {
        this.flyBehavior = fly;
    }

    void setQuackBehavior(QuackBehavior quack) {
        this.quackBehavior = quack;
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void swim() {
        System.out.println("Swimming");
    }

    abstract void display();

    void performFly() {
        flyBehavior.fly();
    }
}
