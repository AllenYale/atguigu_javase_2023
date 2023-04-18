package com.atguigu03.field_method.exer;

/**
 * ClassName: Employee
 * Description:
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/18 8:08
 * @ Version: v1.0
 */
public class Employee {

    int no;//编号
    String name;//姓名
    int age;//年龄
    double salary;
    MyDate birthday;//生日

    //java.lang.StackOverflowError
    //stack 后进先出、每调用一次方法栈桢方式入栈、执行完之后才离开栈，还没离开又有新的方法进入栈。栈大小有限，堆满后溢出。
    public void info(){
        info();
    }

}
