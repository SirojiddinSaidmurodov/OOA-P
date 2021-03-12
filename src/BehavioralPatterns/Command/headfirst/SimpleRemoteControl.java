package BehavioralPatterns.Command.headfirst;

public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }
}
