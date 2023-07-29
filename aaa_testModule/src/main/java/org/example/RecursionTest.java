package org.example;

/**
 * ClassName: RecursionTest
 * Description:
 *
 * @ Author: Hanyuye
 * @ Date: 2023/7/29 14:42
 * @ Version: v1.0
 */
/*
递归实现
1 * 2 * 3 * 4 * ... * 100
 */
public class RecursionTest {
    public static void main(String[] args){
        System.out.println(recursionMultiply(5));
    }

    public static int recursionMultiply(int num){
        if(num == 0){
            return 1;//0的阶乘等于1.
        }

        return num * recursionMultiply(--num);
    }
}

