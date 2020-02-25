package Strategy.MyOwn;

class Carry implements WorkBehavior {

    @Override
    public void work(String subject) {
        System.out.println("Carrying " + subject + "!");
    }
}
