package Facade.Custom;

class Car {
    private Engine engine;
    private Breaks breaks;
    private Keys keys;
    private Belts belts;
    private Doors doors;

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
