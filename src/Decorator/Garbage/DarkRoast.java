package Decorator.Garbage;

class DarkRoast extends Beverage {
    @Override
    double cost() {
        return super.cost() + 0.67;
    }
}
