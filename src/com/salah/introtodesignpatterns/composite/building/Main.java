package com.salah.introtodesignpatterns.composite.building;

public class Main {
    public static void main(String[] args) {
        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("123 Street - first floor");
        int firstFloor = building.addStructure(floor1);

        Room room1 = new Room("first room");
        Room room2 = new Room("second room");
        Room room3 = new Room("third room");

        int firstRoom = floor1.addStructure(room1);
        int secondRoom = floor1.addStructure(room2);
        int thirdRoom = floor1.addStructure(room3);

//        building.location();
        building.enter();

        Housing currentFloor = (Housing) building.getStructure(firstFloor);
        currentFloor.enter();

        IStructure currentRoom = currentFloor.getStructure(firstFloor);
        currentRoom.enter();

        building.exit();

    }
}
