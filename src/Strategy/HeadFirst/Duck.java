package Strategy.HeadFirst;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
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
