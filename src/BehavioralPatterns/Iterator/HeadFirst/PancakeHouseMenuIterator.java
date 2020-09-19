package BehavioralPatterns.Iterator.HeadFirst;

import java.util.ArrayList;

class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems.get(position);
        position++;
        return item;
    }
}
