package BehavioralPatterns.Strategy.SuperStrategy;

class FlyWithWings implements BehavioralPatterns.Strategy.SuperStrategy.FlyBehavior {

    @Override
    public void move() {
        System.out.println("Flying with wings!");
    }
}
