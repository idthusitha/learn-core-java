package com.learn.core.java.oop.thread;

public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        t1.start();
        t1.join(); // wait for t1 to finish

        t2.start();
        t2.join(); // wait for t2 to finish

        System.out.println("Main thread finished");
    }
}
