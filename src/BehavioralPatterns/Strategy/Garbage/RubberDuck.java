package BehavioralPatterns.Strategy.Garbage;

class RubberDuck extends Duck implements Quackable {

    @Override
    void display() {
        System.out.println("I'm RubberDuck");
    }

    @Override
    public void quack() {
        System.out.println("Peeeeeep!");
    }
}
