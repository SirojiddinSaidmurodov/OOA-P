package Factory.FactoryOfFactories;

enum pizzaType {
    A,
    B,
    C
}

interface IFactory {
    IPizza create(pizzaType type);
}
