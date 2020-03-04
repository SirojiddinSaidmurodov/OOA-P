package Strategy.SuperStrategy;

class NotWork implements WorkBehavior {

    @Override
    public void performAction() {
        System.out.println("Do not working!");
    }
}
