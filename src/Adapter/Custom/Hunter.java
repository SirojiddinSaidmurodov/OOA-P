package Adapter.Custom;

class Hunter {
    String name;

    public Hunter(String name) {
        this.name = name;
    }

    public void hunt(Deer deer) {
        deer.die(this);
    }
}
