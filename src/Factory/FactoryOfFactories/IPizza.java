package Factory.FactoryOfFactories;

abstract class IPizza {
    abstract void prepare();

    abstract void bake();
}

class PizzaAOrd extends IPizza {

    @Override
    public void prepare() {
        System.out.println("AOrd");
    }

    @Override
    public void bake() {

    }
}

class PizzaBOrd extends IPizza {

    @Override
    public void prepare() {
        System.out.println("BOrd");
    }

    @Override
    public void bake() {

    }
}

class PizzaCOrd extends IPizza {
    @Override
    public void prepare() {
        System.out.println("COrd");
    }

    @Override
    public void bake() {

    }
}


class PizzaAVeg extends IPizza {

    @Override
    public void prepare() {
        System.out.println("AVeg");
    }

    @Override
    public void bake() {

    }
}

class PizzaBVeg extends IPizza {

    @Override
    public void prepare() {
        System.out.println("BVeg");
    }

    @Override
    public void bake() {

    }
}

class PizzaCVeg extends IPizza {
    @Override
    public void prepare() {
        System.out.println("CVeg");
    }

    @Override
    public void bake() {

    }
}
