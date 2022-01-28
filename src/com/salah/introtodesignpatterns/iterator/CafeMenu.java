package com.salah.introtodesignpatterns.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
    Hashtable<String, MenuItem> menuItems = new Hashtable<>();

    public CafeMenu() {
        addItem(getClass() + " name 1 ", "desc 1", true, 2.50);
        addItem(getClass() + " name 2 ", "desc 2", false, 2.50);
        addItem(getClass() + " name 3 ", "desc 3", true, 2.50);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
