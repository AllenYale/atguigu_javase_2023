package com.atguigu08.constructor;

/**
 * ClassName: Person
 * Description:
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/21 21:04
 * @ Version: v1.0
 */
public class Person {
    private String name;
    int age = 111;//变量赋值先后：变量显示赋值先，构造器赋值后。（看jclasslib工具看编译后字节码文件）

    //constructor is not a method
    public Person(){
        System.out.println("Person constructor");
    }

    public Person(int a){
        this.age = 123;
    }
    public String showName(){
        return name;
    }

    public void setAge(int a){
        this.age = a;

    }
}
