package CreationalPatterns.Factory.FactoryMethodHeadFirst;

class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYCheesePizza();
            case "pepperoni" -> new NYPepperoniPizza();
            case "clam" -> new NYClamPizza();
            case "veggie" -> new NYVeggiePizza();
            default -> null;
        };
    }
}


class NYCheesePizza extends Pizza {
    NYCheesePizza() {
        name = "NY style cheese pizza";
        dough = "Thin dough";
        sauce = "Marinara sauce";
        toppings.add("Grated Regiano cheese");
    }
}

class NYPepperoniPizza extends Pizza {

}

class NYClamPizza extends Pizza {
}

class NYVeggiePizza extends Pizza {

}
