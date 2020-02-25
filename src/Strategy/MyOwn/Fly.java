package Strategy.MyOwn;

class Fly implements MoveBehavior {

    @Override
    public void move(String place) {
        System.out.println("Flying to " + place + "!");
    }
}
