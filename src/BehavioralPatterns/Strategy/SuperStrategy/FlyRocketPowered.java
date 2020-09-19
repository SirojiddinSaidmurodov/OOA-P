package BehavioralPatterns.Strategy.SuperStrategy;

class FlyRocketPowered implements BehavioralPatterns.Strategy.SuperStrategy.FlyBehavior {

    @Override
    public void move() {
        System.out.println("Flying with a rocket!");
    }
}
