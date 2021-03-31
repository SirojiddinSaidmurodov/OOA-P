package BehavioralPatterns.State.headfirst;

import BehavioralPatterns.State.problem.GumballMachine;

public class NoQuarter implements State {
    GumballMachine gumballMachine;

    public NoQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public NoQuarter(BehavioralPatterns.State.headfirst.GumballMachine gumballMachine) {
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
