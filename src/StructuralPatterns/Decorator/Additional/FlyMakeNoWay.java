package StructuralPatterns.Decorator.Additional;

public class FlyMakeNoWay implements FlyBehavior {
    FlyBehavior flyBehavior;

    FlyMakeNoWay(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void fly() {
        System.out.println("Can't fly!");
    }
}
