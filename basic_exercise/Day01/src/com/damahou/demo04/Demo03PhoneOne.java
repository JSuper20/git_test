package com.damahou.demo04;

import com.pojo.Phone;

public class Demo03PhoneOne {
    public static void main(String[] args) {
        // 根据Phone类，创建一个名为one的对象
        // 格式为：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println(one.color); // null
        System.out.println("========");

        one.brand = "Apple"; // 品牌苹果
        one.price = 3999.99; // 售价3999.99
        one.color = "white"; // 颜色白色
        System.out.println(one.brand); // 苹果
        System.out.println(one.price); // 3999.99
        System.out.println(one.color); // 白色
        System.out.println("=====");

        one.call("乔布斯");
        one.sendMsg();
    }
}
