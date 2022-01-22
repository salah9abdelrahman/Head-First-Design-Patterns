package com.salah.introtodesignpatterns.composite.building;

/**
 * IComponent interface that define the overall type
 */
public interface IStructure {
    void enter();

    void exit();

    void location();

    String getName();
}
