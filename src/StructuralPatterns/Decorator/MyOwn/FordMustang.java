package StructuralPatterns.Decorator.MyOwn;

class FordMustang extends Car {

    public FordMustang() {
        topSpeed = 200;
        acceleration = 7;
        weight = 1700;
        power = 230;
        description = "Ford Mustang";
    }

    @Override
    int cost() {
        return 30000;
    }
}
