package com.test01;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: SearchTest
 * Description:
 * binarySearch Practice 二分查找练习
 *
 * @Author hanyuye
 * @Create 2023/11/3 15:22
 * @Version 1.0
 * @IDE idea_mac_m1
 */
public class SearchTest {

    //查找元素5是否在上述数组中出现过？如果出现，输出对应的索引值。
    public static void main(String[] args) {
        int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};

        Arrays.sort(arr1);//[2, 3, 5, 7, 34, 34, 34, 54, 65, 67, 76]
        System.out.println(Arrays.toString(arr1));
        System.out.println(binarySearch(arr1, 5));
    }

    //二分查找
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int mid = (left+right)/2;
            if(arr[mid]>target){
                right = --mid;
            } else if (arr[mid]<target) {
                left = ++mid;
            }else{// if (arr[mid] == target)
                return mid;
            }
        }
        return -1;//不存在target元素
    }





    @Test
    public void test(){
        System.out.println("hello ");
    }


}
