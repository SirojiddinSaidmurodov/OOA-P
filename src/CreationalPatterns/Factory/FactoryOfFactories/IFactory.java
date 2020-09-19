package CreationalPatterns.Factory.FactoryOfFactories;

enum pizzaType {
    A,
    B,
    C
}

interface IFactory {
    APizza create(pizzaType type);
}
