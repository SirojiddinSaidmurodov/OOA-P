package Factory.FactoryOfFactories;

class FactoryOrd implements IFactory {

    @Override
    public IPizza create(pizzaType type) {
        return switch (type) {
            case A -> new PizzaAOrd();
            case B -> new PizzaBOrd();
            case C -> new PizzaCOrd();
        };
    }
}
