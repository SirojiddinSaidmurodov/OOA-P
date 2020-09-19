package BehavioralPatterns.Strategy.MyOwn;

abstract class Robot {
    MoveBehavior moveBehavior;
    WorkBehavior workBehavior;

    void performMoveTo(String place) {
        moveBehavior.move(place);
    }

    void performWorkOn(String subject) {
        workBehavior.work(subject);
    }

    void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    void setWorkBehavior(WorkBehavior workBehavior) {
        this.workBehavior = workBehavior;
    }

    abstract void display();
}
