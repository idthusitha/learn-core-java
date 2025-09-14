package com.learn.core.java.oop.basic_interface;

public abstract class Dog implements Animal{

    //must implement all abstract methods of interface

    abstract void eat();

    void walk() {
        System.out.println("Dog is walking");
    }
}
