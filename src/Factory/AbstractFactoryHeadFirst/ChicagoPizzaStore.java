package Factory.AbstractFactoryHeadFirst;

class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        return switch (type) {
            case "cheese" -> new CheesePizza(ingredientFactory).setName("Chicago style cheese pizza");
            case "pepperoni" -> new PepperoniPizza(ingredientFactory).setName("Chicago style pepperoni pizza");
            case "clam" -> new ClamPizza(ingredientFactory).setName("Chicago style clam pizza");
            case "veggie" -> new VeggiePizza(ingredientFactory).setName("Chicago style veggie pizza");
            default -> null;
        };
    }
}
