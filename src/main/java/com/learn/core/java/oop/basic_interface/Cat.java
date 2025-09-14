package com.learn.core.java.oop.basic_interface;

public class Cat implements Animal{
    @Override
    public String getColor() {
        return "Black and White";
    }

    @Override
    public String getName() {
        return "Kitty";
    }

    //must implement all abstract methods of interface
}
