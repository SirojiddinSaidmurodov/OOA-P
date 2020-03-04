package Strategy.SuperStrategy;

class MiniDuckSimulator {
    public static void main(String[] args) {
        Strategy.SuperStrategy.Duck mallard = new Strategy.SuperStrategy.MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Strategy.SuperStrategy.Duck model = new ModelDuck();
        model.performFly();
        model.setMotion(new FlyRocketPowered());
        model.performFly();
    }
}
