package BehavioralPatterns.Strategy.SuperStrategy;

class Quack implements BehavioralPatterns.Strategy.SuperStrategy.QuackBehavior {

    @Override
    public void performAction() {
        System.out.println("Quack!");

    }
}
