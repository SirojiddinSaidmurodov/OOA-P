package Strategy.Garbage;

class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    void display() {
        System.out.println("I'm real mallard");
    }

    @Override
    public void fly() {
        System.out.println("Flying!");
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
