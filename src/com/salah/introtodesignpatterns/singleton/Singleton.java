package com.salah.introtodesignpatterns.singleton;

import java.io.Serializable;
import java.util.Objects;

/*
PS:  This way has a problem with serialization and Reflection
 Approach 1: declare all  instance fields transient and provide readResolve method
  Approach 2: use enum to implement Singleton

 */
public class Singleton implements Serializable {
    private volatile static Singleton instance;
    private transient int value;

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

    private Object readResolve() {
        return instance;
    }
}