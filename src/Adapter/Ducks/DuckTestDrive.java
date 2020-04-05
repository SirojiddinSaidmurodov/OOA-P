package Adapter.Ducks;

class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        TurkeyAdapter adapted = new TurkeyAdapter(turkey);
        System.out.println("Duck says:");
        test(duck);
        System.out.println("Turkey says:");
        turkey.fly();
        turkey.gobble();
        System.out.println("Adapted turkey says:");
        test(adapted);
    }

    public static void test(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
