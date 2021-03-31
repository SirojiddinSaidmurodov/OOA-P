package BehavioralPatterns.State.headfirst;

import java.util.ArrayList;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    ArrayList<State> log;
    int count = 0;
    private State state;

    public GumballMachine(int count) {
        log = new ArrayList<>();
        soldOutState = new SoldOut(this);
        noQuarterState = new NoQuarter(this);
        hasQuarterState = new HasQuarter(this);
        soldState = new Sold(this);
        this.count = count;
        if (count > 0) {
            this.setState(noQuarterState);
        } else {
            this.setState(soldOutState);
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        log.add(state);
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count -= 1;
        }
    }
}
