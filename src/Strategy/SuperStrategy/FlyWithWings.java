package Strategy.SuperStrategy;

class FlyWithWings implements Strategy.SuperStrategy.FlyBehavior {

    @Override
    public void move() {
        System.out.println("Flying with wings!");
    }
}
