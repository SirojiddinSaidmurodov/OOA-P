package StructuralPatterns.Decorator.Additional;

class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
