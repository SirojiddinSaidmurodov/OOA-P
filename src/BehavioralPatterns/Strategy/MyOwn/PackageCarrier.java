package BehavioralPatterns.Strategy.MyOwn;

class PackageCarrier extends Robot {
    PackageCarrier(){
        this.moveBehavior = new MoveOnWheel();
        this.workBehavior = new Carry();
    }
    @Override
    void display() {
        System.out.println("I'm property of AliExpress!");
    }
}
