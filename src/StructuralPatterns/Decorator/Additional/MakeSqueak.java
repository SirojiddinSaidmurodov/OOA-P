package StructuralPatterns.Decorator.Additional;

class MakeSqueak extends DuckDecorator {
    MakeSqueak(Duck duck) {
        this.duck = duck;
        this.flyBehavior = duck.flyBehavior;
        this.quackBehavior = new Squeak();
    }

    @Override
    void display() {
        duck.display();
    }
}
