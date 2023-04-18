package com.atguigu02.memory;

/**
 * ClassName: PersonTest
 * Description:
 * 栈（stack）：方法内定义变量，存储在栈中
 * 堆（heap）：new 出来的结构（对象实体）包括对象属性
 * 方法区（method）：存放类的模板。比如Person类的模板
 *
 * 总原则：成员变量（随着类的创建）在堆空间，局部变量永远在栈空间中
 *
 * 内存结构：
 * 属性/成员变量（随着类的创建在堆中）：
 *  存储在堆空间中
 *  随着对象创建&消亡
 *
 * 局部变量：
 *  存放位置：存储在栈空间中
 *  声明周期：随着方法创建&消亡
 *  作用域：方法、构造器、代码块（形参也是局部变量）
 *
 * 默认值：
 *  属性都有默认值，局部变量都没有默认值（在使用局部变量之前必须显示赋值）。
 *
 * @ Author: Hanyuye
 * @ Date: 2023/4/17 23:26
 * @ Version: v1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();

        //只要看到变量前面有个类型，也就是一个新的变量。

        person1.name = "allenYale";
        person1.age = 28;
        person1.gender = '男';

        // 栈中多了一个person2变量
        Person person2 = person1;//把person1存的东西，给到person2，person1存的是堆空间中的地址值。
        person2.name = "clark";

        System.out.println("age:"+person1.age + " name:"+person1.name+" gender:"+person1.gender);
        System.out.println("age:"+person2.age + " name:"+person2.name+" gender:"+person2.gender);
    }
}
