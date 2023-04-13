package com.atguigu4.search_sort.exer_search;

public class BinarySearchTest {
    public static void main(String[] args) {
        //二分法查找元素,，【必须先排序，知道desc还是asc】
        int[] arr = {1,2,5,7,11,19,10};

        int target = 1;
        target = 7;

        int end = arr.length-1;
        int start = 0;

        boolean isFlag = false;

        while(start<=end){//如果持续没找到start将>end
            int mid = (end + start)/2;
            if(arr[mid] == target){
                System.out.println("find it successfully, index is:"+mid+"\t target is:"+arr[mid]);
                isFlag = true;
                break;
            }else if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }

        }
        if(!isFlag) System.out.println("cant find target...");

    }
}
