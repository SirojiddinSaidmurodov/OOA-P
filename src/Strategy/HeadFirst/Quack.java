package Strategy.HeadFirst;

class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
