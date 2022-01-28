package com.salah.introtodesignpatterns.composite.building;

public class Room implements IStructure {
    public String name;

    public Room(String name) {
        this.name = name;
    }

    public void exit() {
        System.out.println("You have left the " +
                this.getName());
    }

    public void location() {
        System.out.println("You are currently in the" +
                this.getName());
    }

    public String getName() {
        return this.name;
    }
}
