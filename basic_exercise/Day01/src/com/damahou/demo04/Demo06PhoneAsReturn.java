package com.damahou.demo04;

import com.pojo.Phone;

public class Demo06PhoneAsReturn {
    public static void main(String[] args) {
        Phone two = method();
        System.out.println(two);
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println();
    }

    private static Phone method(){
        Phone one = new Phone();
        System.out.println(one);
        one.brand = "锤子";
        one.price = 1230.00;
        one.color = "black";
        one.call("罗永浩");
        one.sendMsg();
        return one;
    }
}
