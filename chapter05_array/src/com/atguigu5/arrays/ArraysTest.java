package com.atguigu5.arrays;

import java.util.Arrays;


//数组特点：
// 是有序的、可重复的。一旦初始化，长度确定不可更改。
//有序指有索引，存取顺序固定。可重复就是element是否可以重复。
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,3,5,7,1};
        int[] arr2 = new int[]{2,3,5,7,12};

        //Arrays比较两个数组所有元素是否相等
        System.out.println(Arrays.equals(arr1, arr2));

        //遍历数组
        System.out.println(Arrays.toString(arr1));
        //fill every element to xx
//        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        //quick sort
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //binary search , sorted
        int key = Arrays.binarySearch(arr1, 4);
        System.out.println(key);

//        String[] strArr = new String[3];
//        System.out.println(strArr[0].toString());//Exception in thread "main" java.lang.NullPointerException



    }
}
