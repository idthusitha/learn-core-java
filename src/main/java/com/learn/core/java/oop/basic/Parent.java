package com.learn.core.java.oop.basic;

public class Parent {

    //Primitive types
    //byte, short, int, long, float, double, char, boolean

    //Wrapper classes
    //Byte, Short, Integer, Long, Float, Double, Character, Boolean

    private byte age = 127; //-128 to 127
    Integer name;
    private Double accountBalance = 1000.50;
    protected Long phoneNumber = 1234567890L;
    public String address = "Nittambuwa";

    public final Double getAccountBalance() {
        return accountBalance;
    }

    public static Long getPhoneNumber() {
        return 123456789L;
    }

    public String getAddress() {
        return "My address is " + address;
    }

    public String getAddress(String year) {
        if (year.equals("2005")) {
            return "My address is " + "Kandy";
        }else if (year.equals("2006")) {
            return "My address is " + "Galle";
        }
        return "My address is " + address;
    }

    public String getAddress(String year, String month) {
        if (year.equals("2005") && month.equals("Jan")) {
            return "My address is " + "Kadawatha";
        }else if (year.equals("2005") && month.equals("Feb")) {
            return "My address is " + "Ampara";
        }
        return "My address is " + address;
    }

    public void updateAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }





    public static void main(String[] args) {
        System.out.println("Balance: " + new Parent().accountBalance.intValue());
        System.out.println("Balance: " + new Parent().accountBalance.byteValue());
        System.out.println("Balance: " + new Parent().accountBalance.floatValue());
    }
}


//Access Modifiers (public, protected, default, private )
//public can be accessed from anywhere
//protected can be accessed within the same package and subclasses
//default can be accessed within the same package
//private can be accessed within the same class only


//Class is a blueprint of an object
//Enum is a special class that represents a group of constants (unchangeable variables, like final variables)
//record is a special class that is used to hold immutable data

//Interface is a special class that is used to achieve abstraction and multiple inheritance
//Abstract class is a special class that is used to achieve abstraction
