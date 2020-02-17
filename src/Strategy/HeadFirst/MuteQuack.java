package Strategy.HeadFirst;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Can't quack!");
    }
}
