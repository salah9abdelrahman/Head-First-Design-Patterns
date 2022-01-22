package com.salah.introtodesignpatterns.composite.playlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class
 */
public class Playlist implements IPlay {

    private String name;
    private List<IPlay> plays;

    public Playlist(String name) {
        this.name = name;
        this.plays = new ArrayList<>();
    }

    @Override
    public void play(){
        for(IPlay component : plays) {
            component.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {

    }

    public int add(IPlay play) {
        this.plays.add(play);
        return this.plays.size() - 1;
    }

    public IPlay getPlay(int playIndex) {
        return this.plays.get(playIndex);
    }

    @Override
    public String getName() {
        return name;
    }
}
