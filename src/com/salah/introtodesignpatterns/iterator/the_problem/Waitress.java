package com.salah.introtodesignpatterns.iterator.the_problem;


import com.salah.introtodesignpatterns.iterator.MenuItem;

import java.util.ArrayList;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;

    DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printPancakeHouseMenu() {
        ArrayList<MenuItem> menuItems = pancakeHouseMenu.menuItems;
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }
    }

    public void printDinnerMenu() {
        MenuItem[] menuItems = dinnerMenu.menuItems;
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }
    }
}
