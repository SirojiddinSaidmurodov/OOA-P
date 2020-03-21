package Factory.FactoryOfFactories;

interface IFFactory {
    IFactory createFactory(factoryType type);
}
