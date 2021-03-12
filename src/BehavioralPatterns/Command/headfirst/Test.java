package BehavioralPatterns.Command.headfirst;

public class Test {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        control.setCommand(new LightOnCommand(new Light()));
        remoteControl.setCommand(new GarageDoorCommand(new GarageDoor()));

        control.buttonPressed();
        remoteControl.buttonPressed();
    }
}
