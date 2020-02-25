package Strategy.MyOwn;

class Paint implements WorkBehavior {

    @Override
    public void work(String subject) {
        System.out.println("Painting " + subject + "!");
    }
}
