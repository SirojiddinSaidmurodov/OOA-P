package Strategy.MyOwn;

public class MoveOnWheel implements MoveBehavior {

    @Override
    public void move(String place) {
        System.out.println("Riding to " + place + "!");
    }
}
