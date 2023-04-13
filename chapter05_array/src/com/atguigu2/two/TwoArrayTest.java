package com.atguigu2.two;

/**
 * ClassName: TwoArrayTest
 * Description:
 * 二维数组
 * @ Author: Hanyuye
 * @ Date: 2023/4/1 19:55
 * @ Version: v1.0
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        //二维数组
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{5,6}};

        //动态初始化，有三个元素、每个元素有4个元素的数组
        int[][] arr2 = new int[3][4];

        //类型推断
        int[][] arr3 = {{1,2,3},{4},{5}};

        //遍历二维数组
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("=================================");
        //数组元素默认初始化值
        String[][] arr4 = new String[3][];
        System.out.println(arr4[0]);//null






    }
}
