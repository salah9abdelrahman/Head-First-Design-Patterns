package com.salah.introtodesignpatterns.iterator;

import java.util.Iterator;

public class DinnerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem(getClass() + " name 1 ", "desc 1", true, 2.50);
        addItem(getClass() + " name 2 ", "desc 2", false, 2.50);
        addItem(getClass() + " name 3 ", "desc 3", true, 2.50);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Menu is full");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

}
