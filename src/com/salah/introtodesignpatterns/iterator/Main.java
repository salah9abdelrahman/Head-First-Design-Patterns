package com.salah.introtodesignpatterns.iterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinnerMenu = new DinnerMenu();
        Menu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(List.of(pancakeHouseMenu, dinnerMenu, cafeMenu));
        waitress.printMenu();
    }
}
