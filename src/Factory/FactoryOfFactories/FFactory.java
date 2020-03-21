package Factory.FactoryOfFactories;

enum factoryType {
    Ord,
    Veg
}

class FFactory implements IFFactory {
    public IFactory createFactory(factoryType type) {
        return switch (type) {
            case Ord -> new FactoryOrd();
            case Veg -> new FactoryVeg();
        };
    }
}
