package StructuralPatterns.Decorator.Garbage;

class Espresso extends Beverage {
    @Override
    double cost() {
        return super.cost() + 1;
    }
}
