package com.salah.introtodesignpatterns.observer.youtube;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();

        Follower follower1 = new Follower(channel);
        Follower follower2 = new Follower(channel);
        Follower follower3 = new Follower(channel);

        channel.setStatus("alo.mp4");
    }
}
