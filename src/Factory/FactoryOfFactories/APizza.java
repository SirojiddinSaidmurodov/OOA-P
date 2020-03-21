package Factory.FactoryOfFactories;

abstract class APizza {
    abstract void prepare();

    void bake() {
        System.out.println("Baking!");
    }
}

class PizzaAOrd extends APizza {

    @Override
    public void prepare() {
        System.out.println("AOrd");
    }
}

class PizzaBOrd extends APizza {

    @Override
    public void prepare() {
        System.out.println("BOrd");
    }
}

class PizzaCOrd extends APizza {
    @Override
    public void prepare() {
        System.out.println("COrd");
    }
}


class PizzaAVeg extends APizza {

    @Override
    public void prepare() {
        System.out.println("AVeg");
    }
}

class PizzaBVeg extends APizza {

    @Override
    public void prepare() {
        System.out.println("BVeg");
    }
}

class PizzaCVeg extends APizza {
    @Override
    public void prepare() {
        System.out.println("CVeg");
    }
}
