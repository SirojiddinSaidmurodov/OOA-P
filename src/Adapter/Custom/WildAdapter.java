package Adapter.Custom;

class WildAdapter implements WildAnimals {
    Sheep sheep;

    public WildAdapter(Sheep sheep) {
        this.sheep = sheep;
    }

    @Override
    public void die(Hunter hunter) {
        sheep.slaughter();
    }
}
