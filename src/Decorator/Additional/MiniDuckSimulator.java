package Decorator.Additional;

class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("**********************************");
        mallard.setFlyBehavior(new FlyMakeNoWay(new FlyRocketPowered()));
        mallard.performFly();
    }
}
