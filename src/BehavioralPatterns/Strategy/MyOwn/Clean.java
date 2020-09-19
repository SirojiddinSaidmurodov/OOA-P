package BehavioralPatterns.Strategy.MyOwn;

class Clean implements WorkBehavior {

    @Override
    public void work(String subject) {
        System.out.println("Cleaning " + subject + "!");
    }
}
