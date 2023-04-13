package com.atguigu02.reference;

import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @ Author: Hanyuye
 * @ Date: 2023/3/4 15:37
 */

/*

构造器引用/数组引用

*   格式:
*       类名：：new
*
*   说明：
*       调用了类名中的某个构造器，具体调用哪个构造方法看函数式接口中抽象方法的形参列表
*
*
*
*
*
* */
public class ConstuctorRefTest {
    @Test
    public void test01(){
        //函数式接口，匿名内部类
        BiFunction<String, Integer, Emp> biFunction = new BiFunction<String, Integer, Emp>() {
            @Override
            public Emp apply(String s, Integer integer) {
                return new Emp(s, integer);
            }
        };
        System.out.println(biFunction.apply("test01", 2008));

        BiFunction<String, Integer, Emp> biFunctionLambda = (s, integer) -> new Emp(s, integer);

        //函数式接口，构造器引用（函数式接口抽象方法中参数列表中的参数作为实现方法体中的返回值得构造方法中的参数、
        // 且构造器和函数式接口抽象方法返回值相同）
        BiFunction<String, Integer, Emp> biFunction1 = Emp::new;
        System.out.println("biFunction1.apply(\"构造器引用创建对象\", 2008) = " + biFunction1.apply("构造器引用创建对象", 2008));
    }

    @Test
    public void test02(){
        Function<Integer, Emp[]> integerFunction = new Function<Integer, Emp[]>() {
            @Override
            public Emp[] apply(Integer length) {
                return new Emp[length];
            }
        };

        Function<Integer, Emp[]> integerFunction2 = Emp[]::new;
        System.out.println(integerFunction2.apply(20).length);
    }
}
