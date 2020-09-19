package BehavioralPatterns.Strategy.Garbage;

class DecoyDuck extends Duck {

    @Override
    void display() {
        System.out.println("I'm decoy");
    }
}
