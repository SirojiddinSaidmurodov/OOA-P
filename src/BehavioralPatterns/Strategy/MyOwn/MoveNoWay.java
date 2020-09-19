package BehavioralPatterns.Strategy.MyOwn;

class MoveNoWay implements MoveBehavior {

    @Override
    public void move(String place) {
        System.out.println("I'm static!");
    }
}
