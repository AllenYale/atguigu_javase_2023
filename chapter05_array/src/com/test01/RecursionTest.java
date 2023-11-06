package com.test01;

/**
 * ClassName: RecursionTest
 * Description:
 *
 * @Author hanyuye
 * @Create 2023/11/6 10:27
 * @Version 1.0
 * @IDE idea_mac_m1
 */
public class RecursionTest {
    public static void main(String[] args) {
        System.out.println(factorialMethod(10));
    }

    //阶乘；输入10，返回10！
    public static long factorialMethod(long num){
        if(num==1){
            return 1;
        }
        return factorialMethod(num-1)*num;
    }
}
