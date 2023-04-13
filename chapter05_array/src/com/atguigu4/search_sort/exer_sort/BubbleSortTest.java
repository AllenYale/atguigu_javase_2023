package com.atguigu4.search_sort.exer_sort;

/*
冒泡排序时间复杂度平均为O(n^2)
快速排序平均时间复杂度为O(n*log2 n)最快的，开发中常用
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[50000];
        //random arr 100 elements [10,100]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(100-10))+10;
//            arr[i] = i;
        }

        //traverse
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+"\t");
//        }
        System.out.println();

        Long startTime = System.currentTimeMillis();
        //未优化冒泡排序
//        for(int i=0;i<arr.length-1;i++){
//            //Can be optimized, the second cycle does not have to compare n-1 times each time
//            for(int j=0;j<arr.length-1-i;j++){
//                //exchange position
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        //优化冒泡排序
        bubbleSort_optimization(arr);
        Long endTime = System.currentTimeMillis();
        System.out.println("系统运行时间："+(endTime - startTime));
        //traverse again
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+"\t");
//        }
    }

    public static void bubbleSort_optimization(int[] arr) {
        int len = arr.length;
        boolean flag = true; //假设是有序的，从小到大排序
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = false;
                }
            }
            if (flag) break; //如果没有换过，就是有序，直接退出
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
