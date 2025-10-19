package com.learn.core.java.oop.thread;
public class MultiThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }


}