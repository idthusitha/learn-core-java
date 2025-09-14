package com.learn.core.java.oop.basic_interface;

public interface Animal {
    //interface is a 100% abstract class

    //Interface variables are by default public, static and final
    String name = "Animal";
    public static final String color = "White";

    //Interface methods are by default public and abstract
    String getColor();

    public abstract String getName();

    //from Java 8 onwards, we can have default and static methods in interfaces
    default String getRealName() {
        return name;
    }

}
