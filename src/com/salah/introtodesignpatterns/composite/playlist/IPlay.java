package com.salah.introtodesignpatterns.composite.playlist;

/**
 * IComponent
 */
public interface IPlay {
    void play();
    void setPlaybackSpeed(float speed);
    String getName();
}
