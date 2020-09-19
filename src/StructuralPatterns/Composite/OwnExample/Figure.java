package StructuralPatterns.Composite.OwnExample;

class Figure implements Graphic {
    private final String name;

    public Figure(String name) {
        this.name = name;
    }

    public void print(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("  ");
        }
        System.out.println(name);
    }

}
