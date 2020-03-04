package Strategy.SuperStrategy;

class MallardDuck extends Duck {
    public MallardDuck() {
        action = new Quack();
        motion = new FlyWithWings();
    }

    public void display() {
        System.out.println("Mallard");
    }
}
