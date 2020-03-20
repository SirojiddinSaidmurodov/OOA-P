package Factory.FactoryMethodHeadFirst;

class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoCheesePizza();
            case "pepperoni" -> new ChicagoPepperoniPizza();
            case "clam" -> new ChicagoClamPizza();
            case "veggie" -> new ChicagoVeggiePizza();
            default -> null;
        };
    }
}


class ChicagoCheesePizza extends Pizza {
}

class ChicagoPepperoniPizza extends Pizza {

}

class ChicagoClamPizza extends Pizza {
}

class ChicagoVeggiePizza extends Pizza {

}
