package StructuralPatterns.Decorator.HeadFirst;

abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }

    abstract double cost();
}
