package CreationalPatterns.Builder;

class BuilderExample {
    public static void main(String[] args) {
        Baker baker = new Baker();
        PizzaBuilder chicagoPizzaBuilder = new ChicagoPizzaBuilder();
        baker.setPizzaBuilder(chicagoPizzaBuilder);
        baker.constructPizza();

        Pizza pizza = baker.getPizza();
        System.out.println(pizza);
    }
}