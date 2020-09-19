package CreationalPatterns.Factory.FactoryOfFactories;

class PizzaSim {
    public static void main(String[] args) {
        IFFactory fFactory = new FFactory();
        IFactory factory = fFactory.createFactory(factoryType.Ord);
        factory.create(pizzaType.B).prepare();
        factory.create(pizzaType.C).prepare();
        IFactory vegFactory = fFactory.createFactory(factoryType.Veg);
        vegFactory.create(pizzaType.A).prepare();
        vegFactory.create(pizzaType.C).prepare();
    }
}
