package com.atguigu03.field_method.exer;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/18 8:11
 * @ Version: v1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //局部变量在栈桢中，通过局部变量访问对空间中
        Employee employee = new Employee();
        employee.name = "allenYale";
        employee.birthday = new MyDate();
        employee.birthday.year = 1995;
        employee.birthday.month = 6;
        employee.birthday.day = 13;
        System.out.println("no = " + employee.no + ",name = " + employee.name +
                ",age = " + employee.age + ",birthday = [" + employee.birthday + "]");
        //TODO: 2023年4月18日08:29:58 76-面向对象(基础)-方法的作用与方法的声明
    }
}
