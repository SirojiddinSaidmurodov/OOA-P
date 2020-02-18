package Strategy.Garbage;

class Readhead extends Duck implements Flyable, Quackable {

    @Override
    void display() {
        System.out.println("Flying redhead duck!");
    }

    @Override
    public void fly() {
        System.out.println("Flying redhead");
    }

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
