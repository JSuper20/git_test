package com.damahou.demo05;

import com.pojo.Students;

public class Demo04Students {
    public static void main(String[] args) {
        Students stu = new Students();
        stu.setName("damahou");
        stu.setAge(24);
        stu.setMale(true);
        System.out.println("姓名：" + stu.getName() + ", 年龄：" + stu.getAge() + "性别：" + stu.isMale());
    }
}
