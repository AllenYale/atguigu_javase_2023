package com.atguigu3.common_algorithm;

/**
 * ClassName: ArrayExer02Algorithm
 * Description:
 *
 *         1
 *         1 2 1
 *         1 3 3 1
 *         1 4 6 4 1
 *         ....
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/6 22:39
 * @ Version: v1.0
 */
public class ArrayExer02Algorithm {
    public static void main(String[] args) {
//        nine_nine_product_sheet();
//        yang_hui_triangle();
//        testArrayCopyOrAssign();
        arrayLinerSearch(new int[]{1,2,3,4,19,5}, 4);
    }

    public static void yang_hui_triangle(){
        //初始化
        int[][] arr = new int[10][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];
            //各个行数组首尾都是1
            arr[i][0] = arr[i][arr[i].length-1] = 1;
            //各行中间元素赋值,从第二列开始到倒数第二列。
            for(int j=1;j<arr[i].length-1;j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];//每行中间元素 = 上面行同列元素 + 上面行同列左边元素
            }

        }

        //遍历杨辉三角（二维数组）
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void nine_nine_product_sheet(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

    public static void testArrayCopyOrAssign(){
        int[] arr1,arr2;
        arr1 = new int[]{1,1,1,1,1,1};

        //数组赋值，两个数组变量指向同一个堆中地址空间
//        arr2 = arr1;
        //复制array1数组，给array2
        arr2 = new int[arr1.length];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = arr1[i];
        }


        for(int i=0;i<arr1.length;i++){
            //偶数index改为index
            if(i%2==0){
                arr1[i] = i;
            }
        }

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + "\t");
        }
    }

    //shortcut key: 以通过ctrl+shift+m移动到括号外面
    public static void arrayLinerSearch(int[] arr,int target){
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println("找到了元素，"+target+"对应的索引是，"+i);
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.println("can't find element");
        }
    }


}
