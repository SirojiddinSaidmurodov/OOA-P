package BehavioralPatterns.State.headfirst;

public class Sold implements State {
    GumballMachine machine;

    public Sold(GumballMachine gumballMachine) {

    }

    @Override
    public void insertQuarter() {
        System.out.println("Wait, giving you gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn’t get you another gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("A gumball comes rolling out the slot");
        machine.count -= 1;
        if (machine.count == 0) {
            System.out.println("Oops, out of gumballs!");
            machine.setState(machine.soldOutState);
        } else {
            machine.setState(machine.noQuarterState);
        }
    }
}
