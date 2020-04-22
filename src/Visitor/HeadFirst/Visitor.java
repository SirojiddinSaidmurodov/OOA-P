package Visitor.HeadFirst;

class Visitor {
    int num = 0;
    double totalPrice = 0;

    public double count(Menu menu) {
        for (MenuComponent component : menu.menuComponents) {
            component.accept(this);
        }
        return totalPrice / num;
    }

    public void count(MenuItem menuItem) {
        num++;
        totalPrice += menuItem.price;
    }
}
