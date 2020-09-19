package StructuralPatterns.Decorator.MyOwn;

class BugattiVeyron extends Car {

    public BugattiVeyron() {
        topSpeed = 407;
        acceleration = 3.7;
        weight = 1800;
        power = 1001;
    }

    @Override
    int cost() {
        return 3500000;
    }
}
