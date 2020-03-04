package Strategy.SuperStrategy;

class MuteQuack implements QuackBehavior {

    @Override
    public void performAction() {
        System.out.println("Can't quack!");
    }
}
