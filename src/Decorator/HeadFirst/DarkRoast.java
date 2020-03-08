package Decorator.HeadFirst;

class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast";
    }

    @Override
    double cost() {
        return 0.69;
    }
}
