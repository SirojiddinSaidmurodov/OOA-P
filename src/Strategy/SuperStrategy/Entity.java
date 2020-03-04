package Strategy.SuperStrategy;

class Entity {
    IActionBehavior action;
    IMoveBehavior motion;


    void setMotion(Strategy.SuperStrategy.IMoveBehavior motion) {
        this.motion = motion;
    }

    void setAction(IActionBehavior action) {
        this.action = action;
    }

    void performQuack() {
        action.performAction();
    }

    void performFly() {
        motion.move();
    }
}

