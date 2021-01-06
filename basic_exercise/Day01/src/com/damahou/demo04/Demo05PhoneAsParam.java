package com.damahou.demo04;

import com.pojo.Phone;

import javax.jws.Oneway;

public class Demo05PhoneAsParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one);
        one.brand = "锤子";
        one.price = 4000.0;
        one.color = "green";
        one.call("罗永浩");
        one.sendMsg();
        System.out.println("===========");
        method(one);
    }

    /**
     * 对象作为参数进行传递时，传递的是对象的地址值
     * @param param
     */
    private static void method(Phone param){
        System.out.println(param);
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
