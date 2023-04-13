package com.atguigu01.use;

import org.junit.Test;

import java.util.*;

/**
 * @ Author: Hanyuye
 * @ Date: 2023/3/9 22:42
 */
public class CollectionMapTest {
    @Test
    public void test0(){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("hangzhou", 1001);
        hashMap.put("hangzhou1", 1002);
        hashMap.put("hangzhou2", 1003);

        //遍历hashmap by Map.Entry 迭代器
//        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        var entrySet = hashMap.entrySet();
        var iterator = entrySet.iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "---->" + value);
        }
    }

    @Test
    public void test02(){
        //自定义比较两种方法：1：实现comparable接口；2：创建比较器，并作为参数传入。 建议都要使用上泛型

        //定制好comparator之后作为参数传入
        Comparator<Object> comparator = new Comparator<Object>(){
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };


    }






}
