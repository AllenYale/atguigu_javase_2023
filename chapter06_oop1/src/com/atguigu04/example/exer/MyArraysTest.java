package com.atguigu04.example.exer;

/**
 * ClassName: MyArraysTest
 * Description:
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/19 8:07
 * @ Version: v1.0
 */
public class MyArraysTest {
    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();
        int[] arr = {1,3,5,2,8,233,100};
        int max = myArrays.getMax(arr);
        int sum = myArrays.getSum(arr);
        int indexTarget = myArrays.linearSearch(arr, 233);
        System.out.println(indexTarget);
        System.out.println("平均值："+myArrays.getAverage(arr));
        myArrays.printArr(arr);
        myArrays.sort(arr);
        myArrays.reverse(arr);
        myArrays.printArr(arr);
        //TODO: 2023年4月19日08:45:10 79-面向对象(基础)-对象数组的使用及内存解析

    }
}
