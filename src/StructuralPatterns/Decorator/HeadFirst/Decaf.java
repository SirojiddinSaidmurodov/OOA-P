package StructuralPatterns.Decorator.HeadFirst;

class Decaf extends Beverage {
    public Decaf(){
        description = "Decaf";
    }
    @Override
    double cost() {
        return 0.75;
    }
}
