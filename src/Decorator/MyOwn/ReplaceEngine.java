package Decorator.MyOwn;

class ReplaceEngine extends Tuning {
    ReplaceEngine(Car car) {
        this.car = car;
        topSpeed = 300;
        acceleration = 4.9;
        weight = car.weight + 70;
        power = 600;
        description = car.description + ", custom engine";
    }

    @Override
    int cost() {
        return car.cost() + 5000;
    }
}
