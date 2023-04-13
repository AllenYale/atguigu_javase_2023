package com.atguigu02.reference;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @ Author: Hanyuye
 * @ Date: 2023/3/4 14:43
 */
/*
* 方法引用本质：
* 基于lambda表达式更精简
*
* 格式:
* 类（或对象）：：方法名
*
* 1：对象：：实例方法（非静态方法）
*   函数式接口抽象方法a，被重写时方法体中通过某个对象调用了某个方法b，ab形参列表一致/兼容、返回值类型想同。可以使用b对a替换。
*
* 2：类：：静态方法
*   函数式接口抽象方法a，被重写时方法体中通过某个 类 调用了某个静态方法b，ab形参列表一致/兼容、返回值类型想同 。可以使用b对a替换。
*
* 3：类：：实例方法（只是书写格式如此，实际上还是类在调用实例方法）
*   抽象方法有n各参数；实现重写之后方法返回类型一致。
*   重写方法参数列表中个数n-1，抽象方法第一个参数 1st Parameter、刚好为重写方法调用者。满足此情况可以使用方法引用
*
*
* */
public class MethodRefTest {
    @Test
    public void test01(){
        //匿名内部类
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("hello");

        //lambda
        Consumer<String> consumer1 = s -> System.out.println(s);

        //method reference
        //方法参数相同、返回值相同。理解为println方法是accept方法的替换(参数不需要写)
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("test Method ref");
    }

    @Test
    public void test02(){
        //匿名内部类
        Emp emp = new Emp("allen",29);
        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return emp.getName();
            }
        };
        System.out.println("stringSupplier.get() = " + stringSupplier.get());
        //lambda表达式
        Supplier<String> stringSupplier1 = () -> emp.getName();
        System.out.println("stringSupplier1.get() = " + stringSupplier1.get());

        //方法引用
        Supplier<String> stringSupplier2 = emp::getName;
        System.out.println("stringSupplier2 = " + stringSupplier2.get());
    }

    @Test
    public void test03(){
        Function<Double, Long > doubleFunction = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        System.out.println("doubleFunction.apply(3.14) = " + doubleFunction.apply(3.14));

        //方法引用 类：：静态方法
        Function<Double, Long> doubleLongFunction = Math::round;
        System.out.println(doubleLongFunction.apply(3.55));

    }

    @Test
    public void test04(){
        //lambda
        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);

        //method ref
        //int compare(T o1, T o2); String 中 int compareTo(String anotherString)
        //抽象方法有n各参数；实现重写之后方法返回类型一致。
        // 重写方法参数列表中个数n-1，抽象方法第一个参数 1st Parameter、刚好为重写方法调用者。满足此情况可以使用方法引用
        Comparator<String> comparator1 = String::compareTo;


        //匿名内部类
        BiPredicate<String, String> stringStringBiPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };
        System.out.println(stringStringBiPredicate.test("hello", "hahha"));

        //声明/形参是个函数式接口，后面是lambda表达式/方法引用
        //lambda
        BiPredicate<String, String> stringStringBiPredicate1 = (s1, s2) -> s1.equals(s2);

        //method ref
        BiPredicate<String, String> stringStringBiPredicate2 = String::equals;
        System.out.println("stringStringBiPredicate2.test(\"allen\", \"clark\") = " + stringStringBiPredicate2.test("allen", "clark"));
    }


}


