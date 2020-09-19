package BehavioralPatterns.Strategy.MyOwn;

class MoveOnWheel implements MoveBehavior {

    @Override
    public void move(String place) {
        System.out.println("Riding to " + place + "!");
    }
}
