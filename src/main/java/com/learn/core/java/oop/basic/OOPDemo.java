package com.learn.core.java.oop.basic;

public class OOPDemo {
    public static void main(String[] args) {
        System.out.println("This is OOP Demo class");

        Parent parent = new Parent();
        System.out.println(parent.getAddress("2005", "Jan"));   //kaandawatha
        System.out.println(parent.getAddress("2005"));   //Kandy
        System.out.println(parent.getAddress());            //Nittambuwa
        System.out.println(parent.getPhoneNumber());

        Child child = new Child();
        System.out.println(child.getAddress());          //Colombo
        System.out.println(child.getAddress("2005", "Jan"));  //kaandawatha
        System.out.println(child.getAddress("2005")); //Kandy
        System.out.println(child.getPhoneNumber());

        Parent parent1 = new Child();
        System.out.println(parent1.getAddress()); //Colombo
        System.out.println(parent1.getAddress("2005", "Jan"));  //kaandawatha
        System.out.println(parent1.getAddress("2005")); //Kandy
        System.out.println(parent1.getPhoneNumber());

        //Child child1 = new Parent();// This will give compile time error
    }
}
