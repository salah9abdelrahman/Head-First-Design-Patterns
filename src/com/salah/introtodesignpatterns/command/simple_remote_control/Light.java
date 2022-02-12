package com.salah.introtodesignpatterns.command.simple_remote_control;

/**
 * Receiver
 */
public class Light {

    private String roomName;

    public Light() {
    }

    public Light(String roomName) {
        this.roomName = roomName;
    }

    public void on() {
        System.out.println(roomName + " Light on");
    }

    public void off() {
        System.out.println(roomName + " Light off");
    }
}
