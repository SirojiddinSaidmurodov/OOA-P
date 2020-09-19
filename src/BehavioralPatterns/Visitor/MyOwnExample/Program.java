package BehavioralPatterns.Visitor.MyOwnExample;

class Program {

    public static void main(String[] args) {
        Figure figure1 = new Figure("Circle");
        Figure figure2 = new Figure("Ellipse");
        Figure figure3 = new Figure("Square");
        Figure figure4 = new Figure("Pentagon");
        Figure figure5 = new Figure("Octagon");
        Figure figure6 = new Figure("Triangle");

        CompositeGraphic all = new CompositeGraphic("Figures");
        CompositeGraphic noAngles = new CompositeGraphic("No angles");
        CompositeGraphic angle = new CompositeGraphic("Angles");
        CompositeGraphic simple = new CompositeGraphic("Simple");
        CompositeGraphic complex = new CompositeGraphic("Complex");

        noAngles.add(figure1);
        noAngles.add(figure2);
        simple.add(figure6);
        simple.add(figure3);
        complex.add(figure5);
        complex.add(figure4);

        angle.add(simple);
        angle.add(complex);

        all.add(noAngles);
        all.add(angle);

        Visitor visitor = new Visitor();
        visitor.export(all);
    }
}
