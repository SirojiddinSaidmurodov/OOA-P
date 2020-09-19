package BehavioralPatterns.Iterator.Problem;

class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress() {
        pancakeHouseMenu = new PancakeHouseMenu();
        dinerMenu = new DinerMenu();
    }

    public void printMenu() {
        for (MenuItem menuItem : pancakeHouseMenu.getMenuItems()) {
            System.out.println(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
        for (MenuItem menuItem : dinerMenu.getMenuItems()) {
            System.out.println(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }

    public void printBreakfastMenu() {

    }

    public void printLunchMenu() {

    }

    public void printVegetarianMenu() {

    }

    public boolean isItemVegetarian(String name) {
        return true;
    }
}
