package com.atguigu01.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashMap;

/**
 * @ Author: Hanyuye
 * @ Date: 2023/3/3 21:56
 */
/*
Lambda表达式

//lambda —> 左边 lambda形参列表，对应重写接口中抽象方法的形参列表。参数类型可省略，形参只有一个（）可省略
//lambda -> 右边 lambda体，对应接口实现类要重写方法的方法体。 重写接口方法只有一行可以省略return+括号

* Lambda表达式本质：
*   1：接口实现类的对象。Lambda表达式本质是个对象。
*   2：lambda表达式是匿名函数。
*
* 直接造对象掉方法比较重，
* 函数式编程：
* 只要能获取到结果，什么对象去做不重要。重视过程。
*
* 函数式接口：
*   接口中只有一个抽象方法
*   函数式接口提供实现类对象，可以用Lambda表达式
* */
public class LambdaTest01 {

    @Test
    public void test01() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable接口 匿名内部类 run方法。。。");
            }
        };
        runnable.run();

        System.out.println("========lamdba表达式写法========");
        //lamdba表达式写法, 所有确定的都可以删掉

        Runnable runnableLambda = () -> {
            System.out.println("runnable接口 匿名内部类 run方法。。。lamdba表达式写法");
        };
        runnableLambda.run();


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println("========lamdba表达式写法========");
        //参数类型可以省略，重写接口方法只有一行可以省略return 括号
        Comparator<Integer> comparatorLambda = (o1, o2) -> Integer.compare(o1, o2); //Integer::compare。 Can be replaced with 'Comparator.comparingInt'
        int compare = comparatorLambda.compare(123, 321);

        //基于Lambda表达式进一步化简，方法引用 method reference
        // 1：接口抽象方法参数，和重写方法内部方法体中方法参数一样。
        // 2：方法体方法是静态方法,
        // 3：使用方法引用，语法：类名::方法名
        Comparator<Integer> comparatorMethodRef = Integer::max;// int compare(T o1, T o2);   max(int a, int b)
        System.out.println(comparatorMethodRef.compare(2001, 112));

        HashMap<String, Integer> map = new HashMap<>();

        var entries = map.entrySet();




    }
}


