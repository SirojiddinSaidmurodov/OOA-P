package BehavioralPatterns.State.headfirst;

public class HasQuarter implements State {
    GumballMachine gumballMachine;
    public HasQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter!");
    }

    @Override
    public void ejectQuarter() {
        gumballMachine.setState(gumballMachine.noQuarterState);
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.soldState);
        dispense();
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "HasQuarter";
    }
}
