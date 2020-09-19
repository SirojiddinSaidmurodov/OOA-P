package StructuralPatterns.Decorator.Additional;

class MakeNoFly extends DuckDecorator {
    MakeNoFly(Duck duck) {
        this.duck = duck;
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = duck.quackBehavior;
    }

    @Override
    void display() {
        duck.display();
    }
}
