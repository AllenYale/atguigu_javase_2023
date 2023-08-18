package org.searchTest;

/**
 * ClassName: BinarySearchTest
 *
 * Description:
 * @ Author: Hanyuye
 * @ Date: 2023/8/14 21:36
 * @ Version: v1.0
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,6,7,8,11,13,135};
        System.out.println(binarySearch(arr, 11));
        System.out.println(binarySearch(arr, 11));
    }

    //折半查找、二分查找
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int mid = (left + right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
