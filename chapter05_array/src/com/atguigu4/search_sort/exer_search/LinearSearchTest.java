package com.atguigu4.search_sort.exer_search;

public class LinearSearchTest {
    public static void main(String[] args) {
        //线性查找元素
        int[] arr = {1,2,5,7,11,19,10};

        int target = 101;

        //方式一：
//        boolean isFlag = false;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == target){
//                System.out.printf("find it, and the index is: "+i);
//                isFlag = true;
//                break;
//            }
//        }
//
//        if(!isFlag) System.out.println("can't find the element");

        //方式二：
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.printf("find it, and the index is: "+i);
                break;
            }
        }
        if(i==arr.length) System.out.println("can't find the element");
    }
}
