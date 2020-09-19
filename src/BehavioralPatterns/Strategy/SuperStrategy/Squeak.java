package BehavioralPatterns.Strategy.SuperStrategy;

class Squeak implements QuackBehavior {

    @Override
    public void performAction() {
        System.out.println("Squeak!");

    }
}
