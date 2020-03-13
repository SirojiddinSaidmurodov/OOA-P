package Decorator.Additional;

class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("**********************************");
        Duck edited = new MakeNoFly(mallard);
        edited.performQuack();
        edited.performFly();
        System.out.println("**********************************");
        Duck edited2 = new MakeSqueak(new MakeNoFly(mallard));
        edited2.performQuack();
        edited2.performFly();
    }
}
