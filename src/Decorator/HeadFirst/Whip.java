package Decorator.HeadFirst;

class Whip extends CondimentDecorator{
    public Whip(Beverage beverage){
        this.beverage = beverage;
        description = ", Whip";
    }
    @Override
    double cost() {
        return beverage.cost() + 0.25;
    }
}
