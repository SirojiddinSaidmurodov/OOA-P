package CreationalPatterns.Factory.AbstractFactoryHeadFirst;

class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        return switch (type) {
            case "cheese" -> new CheesePizza(ingredientFactory).setName("New-York style cheese pizza");
            case "pepperoni" -> new PepperoniPizza(ingredientFactory).setName("New-York style pepperoni pizza");
            case "clam" -> new ClamPizza(ingredientFactory).setName("New-York style clam pizza");
            case "veggie" -> new VeggiePizza(ingredientFactory).setName("New-York style veggie pizza");
            default -> null;
        };
    }
}
