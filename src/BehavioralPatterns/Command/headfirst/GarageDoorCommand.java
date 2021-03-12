package BehavioralPatterns.Command.headfirst;

public class GarageDoorCommand implements Command {
    private final GarageDoor door;

    public GarageDoorCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }
}
