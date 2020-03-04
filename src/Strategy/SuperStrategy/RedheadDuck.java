package Strategy.SuperStrategy;

class RedheadDuck extends Duck {
    RedheadDuck() {
        action = new Squeak();
        motion = new FlyWithWings();
    }


    void display() {
        System.out.println("I'm really redhead duck!");
    }
}
