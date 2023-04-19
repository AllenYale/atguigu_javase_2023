package com.atguigu04.example.exer;

/**
 * ClassName: MyArrays
 * Description:
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/19 8:05
 * @ Version: v1.0
 */
public class MyArrays {
    /**
     * 获取int型数组元素和
     *
     * @param arr 要获取总和的数组
     * @return 数组总和
     */
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 获取数组元素最大值
     *
     * @param arr 要获取最大值的数组
     * @return 数组最大值
     */
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取最小值
     *
     * @param arr 获取最小值数组
     * @return 数组最小值
     */
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int getAverage(int[] arr) {
        return getSum(arr) / arr.length;
    }

    public void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print("," + arr[i]);
            }
        }

        System.out.println("]");
    }

    public int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * 数组排序，冒泡排序
     * @param arr 要排序的数组
     */
    public void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * 线性查找
     * @param arr 要查找的数组
     * @param target 要查找的目标元素
     * @return 找到的元素index
     */
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        //返回负一没有找到元素
        return -1;
    }
}
