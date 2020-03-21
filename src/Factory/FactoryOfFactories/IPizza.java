package Factory.FactoryOfFactories;

abstract class IPizza {
    abstract void prepare();

    void bake() {
        System.out.println("Baking!");
    }
}

class PizzaAOrd extends IPizza {

    @Override
    public void prepare() {
        System.out.println("AOrd");
    }
}

class PizzaBOrd extends IPizza {

    @Override
    public void prepare() {
        System.out.println("BOrd");
    }
}

class PizzaCOrd extends IPizza {
    @Override
    public void prepare() {
        System.out.println("COrd");
    }
}


class PizzaAVeg extends IPizza {

    @Override
    public void prepare() {
        System.out.println("AVeg");
    }
}

class PizzaBVeg extends IPizza {

    @Override
    public void prepare() {
        System.out.println("BVeg");
    }
}

class PizzaCVeg extends IPizza {
    @Override
    public void prepare() {
        System.out.println("CVeg");
    }
}
