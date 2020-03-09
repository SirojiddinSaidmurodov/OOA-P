package Decorator.MyOwn;

abstract class Car {
    String description;
    double topSpeed;
    double acceleration;
    double weight;
    double power;

    public String getDescription() {
        return description;
    }

    abstract int cost();

    @Override
    public String toString() {
        return getDescription() +
                ", topSpeed= " + topSpeed + " km/h" +
                ", acceleration= " + acceleration + " sTo100" +
                ", weight= " + weight + " kg" +
                ", power= " + power + " HP\n";
    }
}
