//package com.salah.introtodesignpatterns.iterator;
//
//import java.util.ArrayList;
//
//public class PancakeHouseMenuIterator implements Iterator{
//    ArrayList<MenuItem> menuItems;
//    int position = 0;
//
//    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
//        this.menuItems = menuItems;
//    }
//
//    @Override
//    public boolean hasNext() {
//        if (position >= menuItems.size() || menuItems.get(position) == null) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public Object next() {
//        MenuItem menuItem = menuItems.get(position);
//        position++;
//        return menuItem;
//    }
//}
