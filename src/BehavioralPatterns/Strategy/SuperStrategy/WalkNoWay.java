package BehavioralPatterns.Strategy.SuperStrategy;

class WalkNoWay implements WalkBehavior {

    @Override
    public void move() {
        System.out.println("Can't walk!");
    }
}
