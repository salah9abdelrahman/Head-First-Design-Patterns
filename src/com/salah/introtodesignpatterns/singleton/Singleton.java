package com.salah.introtodesignpatterns.singleton;

import java.io.Serializable;

/*
PS:  This way has a problem with serialization and Reflection
 Solution: use enum with Singleton
 */
public class Singleton implements Serializable {
    private volatile static Singleton instance;
    private int value;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}