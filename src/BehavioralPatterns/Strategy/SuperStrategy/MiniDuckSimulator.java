package BehavioralPatterns.Strategy.SuperStrategy;

class MiniDuckSimulator {
    public static void main(String[] args) {
        BehavioralPatterns.Strategy.SuperStrategy.Duck mallard = new BehavioralPatterns.Strategy.SuperStrategy.MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        BehavioralPatterns.Strategy.SuperStrategy.Duck model = new ModelDuck();
        model.performFly();
        model.setMotion(new FlyRocketPowered());
        model.performFly();
    }
}
