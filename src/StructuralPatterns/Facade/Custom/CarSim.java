package StructuralPatterns.Facade.Custom;

public class CarSim {
    public static void main(String[] args) {
        Car car = new Car("Porsche");
        car.start(new Keys("Porsche"));
        System.out.println("******************* Спустя немного времени ************************");
        car.finish();
    }
}
