package StructuralPatterns.Decorator.Garbage;

class HouseBlend extends Beverage {

    @Override
    double cost() {
        return super.cost() + 0.85;
    }
}
