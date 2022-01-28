package com.salah.introtodesignpatterns.composite.building;

/**
 * IComponent interface that define the overall type
 */
public interface IStructure {
   default void enter(){
       System.out.println("You have entered the " +
               this.getName());
   };

    void exit();

    void location();

    String getName();
}
