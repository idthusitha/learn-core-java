package com.learn.core.java.oop.exception;

public class Demo {
    public static void main(String args[]){
        System.out.println("Hello");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Finally");
        }
    }

    public void test (){
        try{
            System.out.println("hello");
            myRiskyMethod();
        }catch (Exception e){
            System.out.println("Need to catch because of myRiskyMethod");
        }
        finally {
            System.out.println("Finnaly");
        }
    }

    public void myRiskyMethod() throws Exception{
        throw new Exception("Throw test exception");
    }
}
