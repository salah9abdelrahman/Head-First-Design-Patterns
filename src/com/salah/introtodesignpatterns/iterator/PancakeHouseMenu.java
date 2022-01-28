package com.salah.introtodesignpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();

        addItem(getClass() + " name 1 ", "desc 1", true, 2.50);
        addItem(getClass() + " name 2 ", "desc 2", false, 2.50);
        addItem(getClass() + " name 3 ", "desc 3", true, 2.50);
    }


    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
//        return new PancakeHouseMenuIterator(menuItems);
        return menuItems.iterator();
    }
}
