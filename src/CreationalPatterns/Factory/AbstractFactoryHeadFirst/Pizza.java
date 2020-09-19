package CreationalPatterns.Factory.AbstractFactoryHeadFirst;

import java.util.Arrays;

abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;
    Pepperoni pepperoni;
    Clams clams;
    PizzaIngredientFactory ingredientFactory;

    public String getName() {
        return name;
    }

    public Pizza setName(String name) {
        this.name = name;
        return this;
    }

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }

    void box() {
        System.out.println("Putting pizza in official box");
    }
}


class CheesePizza extends Pizza {
    CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}

class PepperoniPizza extends Pizza {

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}

class ClamPizza extends Pizza {
    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}

class VeggiePizza extends Pizza {
    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
