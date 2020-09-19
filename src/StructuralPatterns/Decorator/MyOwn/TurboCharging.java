package StructuralPatterns.Decorator.MyOwn;

class TurboCharging extends Tuning {
    TurboCharging(Car car) {
        this.car = car;
        acceleration = car.acceleration - 0.5;
        power = car.power + 50;
        topSpeed = car.topSpeed + 20;
        weight = car.weight + 20;
        description = car.description + ", turbo";
    }


    @Override
    int cost() {
        return car.cost() + 3000;
    }
}
