package CreationalPatterns.Factory.FactoryOfFactories;

interface IFFactory {
    IFactory createFactory(factoryType type);
}
