package Strategy.MyOwn;

class ArmyBot extends Robot {
    ArmyBot() {
        moveBehavior = new MoveOnWheel();
        workBehavior = new Kill();
    }

    @Override
    void display() {
        System.out.println("I'm a soldier");
    }
}
