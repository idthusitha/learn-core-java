package com.learn.core.java.oop.basic;

public final class Child extends Parent {

    public String address = "Colombo";
    public Double accountBalance = 2000.50;
    public double phoneNumber;


    //final methods cannot be overridden
//    public final Double getAccountBalance() {
//        return accountBalance;
//    }

    public static Long getPhoneNumber() {
        return 987654321L;
    }

    public String getAddress() {
        return "My address is " + address;
    }

    public void updateAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void display(){
        System.out.println("This is Child class "+ name);
        System.out.println("This is Child class "+ phoneNumber);
        System.out.println("This is Child class "+ address);
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child: " + child.address);
        System.out.println("Child: " + child.phoneNumber);
    }
}
