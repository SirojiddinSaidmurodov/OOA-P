package Decorator.HeadFirst;

abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public String getDescription() {
        return beverage.getDescription() + this.description;
    }
}
