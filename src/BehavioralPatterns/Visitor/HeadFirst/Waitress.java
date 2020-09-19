package BehavioralPatterns.Visitor.HeadFirst;

import java.util.Iterator;

class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");
        Menu allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread.", true, 3.89));
        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin’) Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice-cream",
                true,
                1.59));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        Visitor visitor = new Visitor();
        System.out.println("Average price: " + visitor.count(allMenus));
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printBreakfastMenu() {

    }

    public void printLunchMenu() {

    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.iterator();
        System.out.println("\nVegetarian menu");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (Exception e) {

            }
        }
    }

    public boolean isItemVegetarian(String name) {
        return true;
    }
}
