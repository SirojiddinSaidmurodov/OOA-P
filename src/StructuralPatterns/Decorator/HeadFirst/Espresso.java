package StructuralPatterns.Decorator.HeadFirst;

class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    double cost() {
        return 0.85;
    }
}
