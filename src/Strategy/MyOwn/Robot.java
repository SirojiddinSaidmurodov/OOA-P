package Strategy.MyOwn;

abstract class Robot {
    MoveBehavior moveBehavior;
    WorkBehavior workBehavior;

    void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    void setWorkBehavior(WorkBehavior workBehavior) {
        this.workBehavior = workBehavior;
    }

    abstract void display();
}
