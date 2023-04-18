package com.atguigu02.memory;

/**
 * ClassName: Person
 * Description:
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/17 23:25
 * @ Version: v1.0
 */
public class Person {
    String name;
    char gender;
    int age;

    //形参也是局部变量
    public void eat(String foodName){
        int someThingCount
                = 0;
        System.out.println("person eat:"+foodName+" somethingCount:"+someThingCount);
    }
}
