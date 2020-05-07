package Visitor.MyOwnExample;

class Figure implements Graphic {
    String name;

    public Figure(String name) {
        this.name = name;
    }

    public void print(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("  ");
        }
        System.out.println(name);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
