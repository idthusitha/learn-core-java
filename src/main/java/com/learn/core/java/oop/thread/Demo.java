package com.learn.core.java.oop.thread;

class Counter {
    int count = 0;
// after making method synchronized it runs 20000 times.
    synchronized void increment() {
        count++;
    }
}

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) c.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + c.count);
    }
}

//Here, both t1 and t2 modify the shared variable count without synchronizatio
//Imagine the initial value of count = 0.
//
//    Case where both threads run at the same time:
//
//        Thread t1 reads count = 0
//
//        Thread t2 reads count = 0 (before t1 updates it)
//
//        t1 increments → count = 1 (writes to memory)
//
//        t2 increments → count = 1 (writes to memory again!)
//
//        🧨 The increment from t1 is lost, so we only increased the value once, not twice.