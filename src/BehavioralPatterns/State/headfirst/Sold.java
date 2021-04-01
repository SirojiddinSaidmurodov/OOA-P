package BehavioralPatterns.State.headfirst;

public class Sold implements State {
    GumballMachine gumballMachine;

    public Sold(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
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
        gumballMachine.count -= 1;
        if (gumballMachine.count == 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.soldOutState);
        } else {
            gumballMachine.setState(gumballMachine.noQuarterState);
        }
    }

    @Override
    public String toString() {
        return "Sold";
    }
}
