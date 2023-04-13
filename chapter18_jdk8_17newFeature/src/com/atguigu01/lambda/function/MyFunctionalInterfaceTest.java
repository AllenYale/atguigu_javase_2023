package com.atguigu01.lambda.function;

import org.junit.Test;

/**
 * @ Author: Hanyuye
 * @ Date: 2023/3/4 14:24
 */
public class MyFunctionalInterfaceTest{
    @Test
    public void test01(){
        MyFunctionalInterface myFunctionalInterface = (str) -> System.out.println(str);
        myFunctionalInterface.method("strasdfa");
//        MyFunctionalInterface myFunctionalInterface2 = System.out::println;
    }
}
