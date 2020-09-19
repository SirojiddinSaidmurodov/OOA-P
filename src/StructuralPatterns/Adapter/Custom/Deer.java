package StructuralPatterns.Adapter.Custom;

interface WildAnimals {
    void die(Hunter hunter);
}

class Deer implements WildAnimals {
    public void die(Hunter hunter) {
        System.out.println("Deer was killed by " + hunter.name);
    }
}
