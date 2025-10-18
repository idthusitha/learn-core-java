package com.learn.core.java.oop.basic_interface;

import java.util.Scanner;

public class InterfaceDemo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Scanner sc = new Scanner(System.in);

        System.out.println("print you name: ");
        String name = sc.nextLine();

        System.out.println("Your name is :" + name);


        System.out.println("Cat color: " + cat.getColor());
        System.out.println("Cat name: " + cat.getName());
        System.out.println("Cat real name: " + cat.getRealName());

        //Animal animal = new Animal(); //cannot create object of interface
    }
}
