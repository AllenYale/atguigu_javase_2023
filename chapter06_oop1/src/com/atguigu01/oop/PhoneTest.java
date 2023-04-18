package com.atguigu01.oop;

/**
 * ClassName: PhoneTest
 * Description: 一般不在类中创造对象，直接另外写一个测试类。XXTest写方法测试。
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/17 23:04
 * @ Version: v1.0
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建对象
        Phone phone = new Phone();

        //调用方法
        phone.call();
        phone.sendMessage("有内鬼、终止交易");
        phone.name = "Nokia";

        System.out.println("phone name:"+phone.name+" phone price:"+phone.price);

        //测试String
        String str = new String("test");

    }
}
