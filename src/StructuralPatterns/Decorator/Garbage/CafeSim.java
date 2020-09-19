package StructuralPatterns.Decorator.Garbage;

class CafeSim {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        System.out.println(espresso.cost());
        espresso.setMilk(true);
        espresso.setSoy(true);
        System.out.println(espresso.cost());
    }

}
