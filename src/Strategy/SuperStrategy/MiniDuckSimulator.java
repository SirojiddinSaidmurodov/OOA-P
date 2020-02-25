package Strategy.SuperStrategy;

import Strategy.SuperStrategy.Duck;
import Strategy.SuperStrategy.FlyRocketPowered;
import Strategy.SuperStrategy.MallardDuck;
import Strategy.SuperStrategy.ModelDuck;

class MiniDuckSimulator {
    public static void main(String[] args) {
        Strategy.SuperStrategy.Duck mallard = new Strategy.SuperStrategy.MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Strategy.SuperStrategy.Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
