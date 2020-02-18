package Strategy.MyOwn;

public class MoveNoWay implements MoveBehavior {

    @Override
    public void move(String place) {
        System.out.println("I'm static!");
    }
}
