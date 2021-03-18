package BehavioralPatterns.State.problem;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 4;
    int state = SOLD_OUT;
    int count;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        switch (state) {
            case SOLD_OUT -> System.out.println("The machine is sold out, can't insert quarter...");
            case NO_QUARTER -> {
                state = HAS_QUARTER;
                System.out.println("A quarter inserted...");
            }
            case HAS_QUARTER -> System.out.println("You can't insert another quarter!");
            case SOLD -> System.out.println("Wait, giving you gumball");
        }
    }

    public void ejectQuarter() {
        switch (state) {
            case SOLD_OUT -> System.out.println("Can't return");
            case NO_QUARTER -> System.out.println("Nothing to return!");
            case HAS_QUARTER -> {
                state = NO_QUARTER;
                System.out.println("Quarter returned");
            }
            case SOLD -> System.out.println("Sorry, you already turned crank");
        }
    }

    public void turnCrank() {
        switch (state) {
            case SOLD_OUT -> System.out.println("You turned, but there are no gumballs");
            case NO_QUARTER -> System.out.println("You turned but there’s no quarter");
            case HAS_QUARTER -> {
                System.out.println("You turned...");
                state = SOLD;
                dispense();
            }
            case SOLD -> System.out.println("Turning twice doesn’t get you another gumball!");
        }
    }

    public void dispense() {
        switch (state) {
            case SOLD_OUT, HAS_QUARTER -> System.out.println("No gumball dispensed");
            case NO_QUARTER -> System.out.println("You need to pay first");
            case SOLD -> {
                System.out.println("A gumball comes rolling out the slot");
                count -= 1;
                if (count == 0) {
                    System.out.println("Oops, out of gumballs!");
                    state = SOLD_OUT;
                } else {
                    state = NO_QUARTER;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
