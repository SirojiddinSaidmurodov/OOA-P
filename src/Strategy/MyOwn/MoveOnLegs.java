package Strategy.MyOwn;

public class MoveOnLegs implements MoveBehavior {

    @Override
    public void move(String place) {
        System.out.println("Walking to " + place + "!");
    }
}
