package CreationalPatterns.Factory.SimpleFactoryHeadFirst;

class SFsim {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.order("cheese");
    }
}
