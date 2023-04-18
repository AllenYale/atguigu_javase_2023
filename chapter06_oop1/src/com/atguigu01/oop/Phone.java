package com.atguigu01.oop;

/**
 * ClassName: Phone
 * Description: OOP test
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/17 23:01
 * @ Version: v1.0
 */
public class Phone {
    //属性
    String name;
    double price;

    //方法
    public void call() {
        System.out.println("phone can call..");
    }

    public void sendMessage(String message) {
        System.out.println("send msg:" + message);
    }

    public void playGame(){
        System.out.println("playing game..");
    }
}
