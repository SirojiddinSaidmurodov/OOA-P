package BehavioralPatterns.State.headfirst;

public class SoldOut implements State {
    GumballMachine gumballMachine;

    public SoldOut(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("The machine is sold out, can't insert quarter...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Can't return");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "SoldOut";
    }
}
