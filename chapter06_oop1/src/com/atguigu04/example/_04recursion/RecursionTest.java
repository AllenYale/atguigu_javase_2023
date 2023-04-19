package com.atguigu04.example._04recursion;

/**
 * ClassName: RecursionTest
 * Description:
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/19 22:42
 * @ Version: v1.0
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest recursionTest = new RecursionTest();
//        recursionTest.print();
        System.out.println(recursionTest.calculateSum(100));
        System.out.println(recursionTest.multiply(5));
    }

    //StackOverflowError
//    public void print(){
//        System.out.println("printing...");
//        print();
//    }

    //计算1-i的和
    public int calculateSum(int i){
        if(i==1){
            return 1;
        }
        return i+calculateSum(--i);
    }

    public int multiply(int n){
        if(n==1){
            return 1;
        }
        return n*multiply(n-1);
    }

    /**
     * 斐波那契数列：1 1 2 3 5 8 13 21 34 55
     *  return fibonacci(n-1)+fibonacci(n-2);
     */
    public int fibonacci(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else{
            return fibonacci(n-1)+ fibonacci(n-2);
        }
    }
}
