package StructuralPatterns.Decorator.Additional;

class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with a rocket!");
    }
}
