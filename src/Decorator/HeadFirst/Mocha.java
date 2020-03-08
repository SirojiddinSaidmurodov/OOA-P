package Decorator.HeadFirst;

class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage){
        this.beverage = beverage;
        description = ", Mocha";
    }
    @Override
    double cost() {
        return beverage.cost() + 0.15;
    }
}
