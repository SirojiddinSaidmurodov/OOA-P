package Decorator.MyOwn;

class Porsche911 extends Car {


    public Porsche911() {
        topSpeed = 250;
        acceleration = 6;
        weight = 1500;
        power = 250;
        description = "Porsche 911 Turbo";
    }

    @Override
    int cost() {
        return 50000;
    }
}
