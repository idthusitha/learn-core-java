package com.learn.core.java.oop.basic_interface;

public class InterfaceDemo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Cat color: " + cat.getColor());
        System.out.println("Cat name: " + cat.getName());
        System.out.println("Cat real name: " + cat.getRealName());

        //Animal animal = new Animal(); //cannot create object of interface
    }
}
