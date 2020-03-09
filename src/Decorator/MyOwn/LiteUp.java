package Decorator.MyOwn;

class LiteUp extends Tuning {
    LiteUp(Car car) {
        this.car = car;
        weight = car.weight - 100;
        topSpeed = car.topSpeed + 5;
        acceleration = car.acceleration - .2;
        description = car.description + ", light weight";
        power = car.power;
    }

    @Override
    int cost() {
        return car.cost() + 600;
    }
}
