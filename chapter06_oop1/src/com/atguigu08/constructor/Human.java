package com.atguigu08.constructor;

public class Human {
    private String humanName;
    private int humanAge;

    public void run(){
        System.out.println("human can run.");
    }

    public void eat(){
        System.out.println("human can eat.");
    }

    public Human(){
        System.out.println("human constructor....");
    }

}
