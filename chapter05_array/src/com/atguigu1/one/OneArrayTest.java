package com.atguigu1.one;

/**
 * ClassName: OneArrayTest
 * Description: 一维数组
 *
 * @ Author: Hanyuye
 * @ Date: 2023/3/31 23:50
 * @ Version: v1.0
 */
/*
数组特点：
数组中的元素在内存中是有序、依此排序的。
数组引用数据类型。元素可以使基本、引用
数组一旦完成初始化，长度就确定、且不能更改。
创建数组对象会在内存开辟“连续的空间”，空间大小和数组长度、数组元素类型有关。

数组内存解析
栈 statck：
一端进出，先进后出、后进先出。

虚拟机栈stack：存放方法中声明的变量。 int[] arr = new int[]{1,2,3}; arr
堆heap：存放数组实体，所有数组元素
 */
public class OneArrayTest {
    public static void main(String[] args) {
        //1：数组声明初始化
        double[] prices;
        prices = new double[]{10.32,43.22,12.31};//静态初始化
        int[] arr1 = {1,2,3};//类型推断，如果直接int[] arr; arr = {};这样会报错，没法类型推断
        
        String[] foods = new String[4];//动态初始化

        //数组长度：用来描述数组容器容量大小
        //使用length属性表示
        System.out.println(arr1.length);

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        System.out.println("---------");
        char[] crr = new char[3];//默认值：'\u0000'==0
        for (int i = 0; i < crr.length; i++) {
            System.out.println(crr[i]+1);
        }
        System.out.println('\u0000'==0);


        //2个变量指向同一个地址
        int[] arr = new int[]{1,2,3};
        int[] arr2 = arr;
        arr2[2] = 4;
        System.out.println(arr[2]);

        double[] drr = new double[]{1.2,1.3,1.4};
        System.out.println(drr);//[D@4eec7777  [表示数组、D表示double类型。

    }
}
