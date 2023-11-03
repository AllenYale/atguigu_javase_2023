package com.test01;

import com.atguigu4.search_sort.exer_sort.BubbleSortTest;

import java.util.Arrays;

/**
 * ClassName: SortTest
 * Description:
 * bubbleSort practice 冒泡排序练习
 *
 * @Author hanyuye
 * @Create 2023/11/3 16:44
 * @Version 1.0
 * @IDE idea_mac_m1
 */
public class SortTest {
    public static void main(String[] args) {
//        int[] arr = new int[]{11,5,4,3,2,1,3,5,2,4,6};
        int[] arr = new int[]{1,2,4,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //优化版，冒泡排序
    public static void bubbleSort(int[] arr){
        boolean flag = true;//假设已经是asc排序的

        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//                //asc sort
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //如果相邻两个没有交换过位置，则默认有序；交换过了就无序；
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

}
