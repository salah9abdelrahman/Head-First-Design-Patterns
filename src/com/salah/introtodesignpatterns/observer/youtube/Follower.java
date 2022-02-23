package com.salah.introtodesignpatterns.observer.youtube;

public class Follower implements Observer {
    private Subject channel;
    private String status;

    public Follower(Subject channel) {
        this.channel = channel;
        channel.registerObserver(this);
    }

    @Override
    public void update(String status) {
        this.status = status;
        play();
    }

    public void play() {
        System.out.println("playing video: " + status);
    }
}
