package com.atguigu02.selfdefine;

import org.junit.Test;

/**
 * @ Author: Hanyuye
 * @ Date: 2023/3/9 23:55
 */
public class GenericTest {
    @Test
    public void test01(){
        //调用静态泛型方法
        String allen = Man.run("allen");

    }
}
//泛型类
class Man<T> extends Human<T>{
    T t;
    public void show(T t){
        System.out.println(t);
    }
    //泛型方法
    public static <E> E run(E e){
        return e;
    }
}

class Human<T>{

}
