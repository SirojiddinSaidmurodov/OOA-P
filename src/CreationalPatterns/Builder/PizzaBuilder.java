package CreationalPatterns.Builder;

abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();
}

class ChicagoPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("Thick crust dough");
    }

    public void buildSauce() {
        pizza.setSauce("Plum tomato sauce");
    }

    public void buildTopping() {
        pizza.setTopping("Sliced pepperoni");
    }
}


class NYBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("Thin crust dough");
    }

    public void buildSauce() {
        pizza.setSauce("Marinara sauce");
    }

    public void buildTopping() {
        pizza.setTopping("Mozzarella cheese");
    }
}
