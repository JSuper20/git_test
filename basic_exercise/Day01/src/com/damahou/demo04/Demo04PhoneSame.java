package com.damahou.demo04;

import com.pojo.Phone;

public class Demo04PhoneSame {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one);
        one.brand = "苹果";
        one.price = 8888.00;
        one.color = "土豪金";
        one.call("乔布斯");
        one.sendMsg();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("=====");
        Phone two = one;
        System.out.println(two);
        two.brand = "小米";
        two.price = 4444.00;
        two.color = "玫瑰金";
        two.call("雷军");
        two.sendMsg();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
    }
}
