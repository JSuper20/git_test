package com.damahou.demo04;

import com.pojo.Student;


/**
 * 通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。
 * 1、导包：也就是指出需要使用的类，在什么位置；
 * import 包名称.类名称;
 * import com.pojo.Student;
 * 对于和当前类属于同一个包下的情况，可以省略导包语句不写。
 * 2、创建、格式：
 * 类名称 对象名 = new 类名称();
 * Student stu = new Student();
 * 3、使用，分为两种情况：
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名(参数)
 * (也就是，想用谁，就用对象名点谁)
 *
 * 【注意事项】
 * 如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样；
 * 整型（byte、short、int、long）默认为0；
 * 浮点型（float、double）默认为0.0；
 * 字符型（char）默认为'/u0000'；
 * 布尔型（boolean）默认为false；
 * 引用数据类型默认为null
 */
public class Demo02Student {
    public static void main(String[] args) {
        // 1、导包

        // 2、创建、格式
        // 类名称 对象名 = new 类名称();
        // 根据Student类，创建一个名为stu的对象
        Student stu = new Student();
        System.out.println(stu);
        // 3、使用类中的成员变量和成员方法
        // 成员变量的使用
        System.out.println(stu.getName()); // null
        System.out.println(stu.getAge()); // 0
        System.out.println("==========");
        stu.setName("damahou");
        stu.setAge(18);
        System.out.println(stu);
        System.out.println(stu.getName());
        System.out.println(stu.getAge());

        // 成员方法的使用
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
