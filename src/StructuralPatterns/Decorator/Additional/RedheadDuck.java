package StructuralPatterns.Decorator.Additional;

class RedheadDuck extends Duck {
    RedheadDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm really redhead duck!");
    }
}
