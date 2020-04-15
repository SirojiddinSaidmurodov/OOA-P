package Adapter.Custom;

class Hunter {
    String name;

    public Hunter(String name) {
        this.name = name;
    }

    public void hunt(WildAnimals wild) {
        wild.die(this);
    }
}
