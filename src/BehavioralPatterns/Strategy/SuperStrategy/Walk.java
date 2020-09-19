package BehavioralPatterns.Strategy.SuperStrategy;

class Walk implements WalkBehavior {

    @Override
    public void move() {
        System.out.println("Walk!");
    }
}
