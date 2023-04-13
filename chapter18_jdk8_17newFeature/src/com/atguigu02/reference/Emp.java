package com.atguigu02.reference;

/**
 * @ Author: Hanyuye
 * @ Date: 2023/3/4 14:57
 */
public class Emp {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Emp() {
    }

    public Emp(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
