package Decorator.HeadFirst;

class Soy extends CondimentDecorator {
    public Soy(Beverage beverage){
        this.beverage = beverage;
        description = ", Soy";
    }
    @Override
    double cost() {
        return beverage.cost() + 0.2;
    }
}
