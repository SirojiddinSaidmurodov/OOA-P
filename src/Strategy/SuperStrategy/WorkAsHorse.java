package Strategy.SuperStrategy;

class WorkAsHorse implements WorkBehavior {

    @Override
    public void performAction() {
        System.out.println("Working!");
    }
}
