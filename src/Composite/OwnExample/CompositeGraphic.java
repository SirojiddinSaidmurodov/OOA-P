package Composite.OwnExample;

import java.util.ArrayList;

class CompositeGraphic implements Graphic {
    private final String name;
    private final ArrayList<Graphic> mChildGraphics = new ArrayList<Graphic>();

    public CompositeGraphic(String name) {
        this.name = name;
    }

    public void print() {
        print(1);
    }

    public void print(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("  ");
        }
        System.out.println("Composite graphic: " + name);
        for (Graphic graphic : mChildGraphics) {
            graphic.print(i + 1);
        }
    }

    public void add(Graphic graphic) {
        mChildGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        mChildGraphics.remove(graphic);
    }

}

