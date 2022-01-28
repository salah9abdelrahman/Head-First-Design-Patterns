package com.salah.introtodesignpatterns.iterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;

    Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
        System.out.println("Pancake House Menu");
        printMenu(pancakeIterator);

        System.out.println("Dinner Menu");
        printMenu(dinnerIterator);


    }


    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem);
        }
    }
}
