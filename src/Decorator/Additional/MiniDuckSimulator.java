package Decorator.Additional;

class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("*********************************");
        Duck edited = new MakeNoFly(mallard);
        edited.display();
        edited.performQuack();
        edited.performFly();
    }
}
