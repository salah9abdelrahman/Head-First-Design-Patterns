package com.salah.introtodesignpatterns.command.simple_remote_control;

/**
 * Receiver
 */
public class GarageDoor {
    void up() {
        System.out.println("Garage door up");
    }

    void down() {
        System.out.println("Garage door down");
    }

    void stop() {
        System.out.println("Garage door stop");
    }

    void lightOn() {
        System.out.println("Garage light on");
    }

    void lightOff() {
        System.out.println("Garage light off");
    }
}
