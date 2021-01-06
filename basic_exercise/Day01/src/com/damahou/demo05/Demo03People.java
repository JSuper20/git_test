package com.damahou.demo05;

import com.pojo.People;

public class Demo03People {
    public static void main(String[] args) {
        // 使用空参构造创建对象
        People p = new People();
        System.out.println(p.getName());
        System.out.println(p.getAge());
        p.setName("张三");
        p.setAge(180);
        System.out.println(p.getName() + p.getAge());
        // 使用全参构造创建对象
        People people = new People("zhangsan", 18);
        System.out.println(people.getName() + people.getAge());
    }
}
