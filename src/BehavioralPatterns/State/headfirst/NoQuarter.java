package BehavioralPatterns.State.headfirst;


public class NoQuarter implements State {
    GumballMachine gumballMachine;

    public NoQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        gumballMachine.setState(gumballMachine.hasQuarterState);
        System.out.println("A quarter inserted...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Nothing to return!");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there’s no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "NoQuarter";
    }
}
