package Decorator.Garbage;

class Decaf extends Beverage {
    @Override
    double cost() {
        return super.cost() + 0.55;
    }
}
