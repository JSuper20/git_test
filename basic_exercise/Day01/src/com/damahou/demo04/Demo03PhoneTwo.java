package com.damahou.demo04;

import com.pojo.Phone;

public class Demo03PhoneTwo {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one);
        one.brand = "诺基亚";
        one.price = 1000.0;
        one.color = "black";
        one.call("比尔盖茨");
        one.sendMsg();
        System.out.println("======");

        Phone two = new Phone();
        System.out.println(two);
        two.brand = "apple";
        two.price = 9999.99;
        two.color = "blue";
        one.call("乔布斯");
        one.sendMsg();
    }
}
