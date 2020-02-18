package Strategy.MyOwn;

public class Clean implements WorkBehavior {

    @Override
    public void work(String subject) {
        System.out.println("Cleaning " + subject + "!");
    }
}
