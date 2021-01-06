package com.damahou.demo07;

public class Demo01Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("damahou");
        s1.setAge(18);
        System.out.println("姓名：" + s1.getName() + ", 年龄：" + s1.getAge());
        System.out.println("========");

        Student s2 = new Student("陈粒", 31);
        System.out.println("姓名：" + s2.getName() + ", 年龄：" + s2.getAge());
        s2.setAge(32);
        System.out.println("姓名：" + s2.getName() + ", 年龄：" + s2.getAge());


    }
}
