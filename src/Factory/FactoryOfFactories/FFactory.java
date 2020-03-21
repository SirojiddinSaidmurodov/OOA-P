package Factory.FactoryOfFactories;

enum factoryType {
    Ord,
    Veg
}

class FFactory {
    public IFactory createFactory(factoryType type) {
        return switch (type) {
            case Ord -> new FactoryOrd();
            case Veg -> new FactoryVeg();
        };
    }
}
