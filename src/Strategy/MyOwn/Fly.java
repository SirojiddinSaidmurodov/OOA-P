package Strategy.MyOwn;

public class Fly implements MoveBehavior {

    @Override
    public void move(String place) {
        System.out.println("Flying to " + place + "!");
    }
}
