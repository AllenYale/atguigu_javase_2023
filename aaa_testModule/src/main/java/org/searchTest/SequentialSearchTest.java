package org.searchTest;

/**
 * ClassName: SequentialSearchTest
 * Description:
 *
 * @ Author: Hanyuye
 * @ Date: 2023/8/14 20:53
 * @ Version: v1.0
 */

/*算法：顺序查找*/
public class SequentialSearchTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"allen","yale","aaa"};
        String target = "aaa";
        System.out.println(sequentialSearch(arr, target));
    }

    public static int sequentialSearch(String[] arr, String target){
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
