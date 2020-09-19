package CreationalPatterns.Factory.SimpleFactoryHeadFirst;

class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            default -> null;
        };
    }
}

class CheesePizza extends Pizza {
}

class PepperoniPizza extends Pizza {

}

class ClamPizza extends Pizza {
}
