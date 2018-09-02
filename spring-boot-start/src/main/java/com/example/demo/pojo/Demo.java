package com.example.demo.pojo;

/**
 * Created by Administrator on 2018/6/9 0009.
 */
public class Demo {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
