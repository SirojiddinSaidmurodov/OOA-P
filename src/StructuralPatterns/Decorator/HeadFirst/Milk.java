package StructuralPatterns.Decorator.HeadFirst;

class Milk extends CondimentDecorator {
    public Milk(Beverage beverage){
        this.beverage = beverage;
        description = ", Milk";
    }
    @Override
    double cost() {
        return beverage.cost() + .15;
    }

}
