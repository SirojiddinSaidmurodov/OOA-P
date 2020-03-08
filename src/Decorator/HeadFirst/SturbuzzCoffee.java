package Decorator.HeadFirst;

class SturbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());
        Beverage dark = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(dark.getDescription() + " $" + dark.cost());

    }
}
