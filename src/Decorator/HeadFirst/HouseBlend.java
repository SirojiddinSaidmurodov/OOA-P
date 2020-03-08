package Decorator.HeadFirst;

class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House blend";
    }
    @Override
    double cost() {
        return 0.85;
    }
}
