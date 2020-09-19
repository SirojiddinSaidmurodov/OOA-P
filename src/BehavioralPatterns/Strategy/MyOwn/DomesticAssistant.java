package BehavioralPatterns.Strategy.MyOwn;

class DomesticAssistant extends Robot {
    DomesticAssistant(){
        workBehavior = new Clean();
        moveBehavior = new MoveOnLegs();
    }
    @Override
    void display() {
        System.out.println("I'm domestic assistant");
    }
}
