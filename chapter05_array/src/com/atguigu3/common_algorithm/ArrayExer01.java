package com.atguigu3.common_algorithm;

/**
 * ClassName: ArrayExer01
 * Description: 数组中特征值计算：最大值、最小值、总和、平均值
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/6 21:36
 * @ Version: v1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        //初始化数组。生成10-99随机数作为元素 ；生成【a，b】随机数，规则：(int)(Math.random()*(b-a+1))+a
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
            //遍历输出数组
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //最大值、最小值、总和、平均值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("max:" + max);

        int min = arr[0];
        for (int temp : arr) {
            if (temp < min) min = temp;
        }
        System.out.println("min:" + min);

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("总和为:" + sum);

        int avg = sum / arr.length;
        System.out.println("avg is :" + avg);
    }
}
