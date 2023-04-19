package com.atguigu04.example._02args;

/**
 * ClassName: ArgsTest
 * Description:
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/19 21:22
 * @ Version: v1.0
 */
public class ArgsTest {
    public static void main(String[] args) {
        new ArgsTest().print(1);
    }

    public void print(int num){

    }

    //可变形参方法调用时,和数组形参不构成重载，不能同时存在，可变型参合数组两个是一回事
//    public void print(int[] arr){
//
//    }

    //可变形参方法调用时，实参个数可以为0-多个,
    public void print(int ... num){

    }

    //vararg must be the last in list
    public void print(int i,int...num){

    }


}
