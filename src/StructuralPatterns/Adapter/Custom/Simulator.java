package StructuralPatterns.Adapter.Custom;

class Simulator {
    public static void main(String[] args) {
        Hunter hunter = new Hunter("Martin");
        Deer deer = new Deer();
        hunter.hunt(deer);
        WildAnimals sheep = new WildAdapter(new Sheep());
        hunter.hunt(sheep);
    }
}
