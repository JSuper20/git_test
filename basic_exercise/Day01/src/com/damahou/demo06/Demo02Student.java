package com.damahou.demo06;

public class Demo02Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("=============");

        Student s2 = new Student("马大哈", 18);
        System.out.println("姓名：" + s2.getName() + ", 年龄：" + s2.getAge());
        // 如果需要改变对象当中成员变量的数据内容，仍然还需要使用setXxx方法
        s2.setAge(30);
        System.out.println("姓名：" + s2.getName() + ", 年龄：" + s2.getAge());
    }
}
