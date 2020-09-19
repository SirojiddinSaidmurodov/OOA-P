package StructuralPatterns.Facade.Custom;

class Car {
    private final Engine engine;
    private final Breaks breaks;
    private final Keys keys;
    private final Belts belts;
    private final Doors doors;

    public Car(String key) {
        engine = new Engine();
        breaks = new Breaks();
        keys = new Keys(key);
        belts = new Belts();
        doors = new Doors();
    }

    public void start(Keys keys) {
        doors.open();
        if (this.keys.turn(keys)) {
            engine.start();
            breaks.unlock();
            belts.fasten();
            System.out.println("Машина к поездке готова");
        }
    }

    public void finish() {
        engine.off();
        breaks.lock();
        belts.unfasten();
        doors.close();
    }
}
