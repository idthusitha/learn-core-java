package com.learn.core.java.oop.thread;

public class MyThreadDemo {
    public static void main(String args[]){

    A a = new A();
    a.start();

    Thread b = new Thread(new B());
    b.start();

    MultiThread t1 = new MultiThread();
    MultiThread t2 = new MultiThread();

        t1.start();
        t2.start();
    }
}
