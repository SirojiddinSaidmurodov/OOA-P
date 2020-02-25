package Strategy.MyOwn;

class Kill implements WorkBehavior {

    @Override
    public void work(String subject) {
        System.out.println("Killing " + subject + "!");
    }
}
