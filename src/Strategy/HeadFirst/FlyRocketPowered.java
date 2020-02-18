package Strategy.HeadFirst;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying with a rocket!");
    }
}
