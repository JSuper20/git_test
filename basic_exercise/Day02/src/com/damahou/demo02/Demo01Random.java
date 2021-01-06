package com.damahou.demo02;

import java.util.Random;
/**
Random类的使用：
Random类用来生成随机数字，使用步骤如下。

1、导包：
import java.util.Random;

2、创建
Random r = new Random();

3、使用
获取一个随机的int数字（范围时int的所有范围，有正负两种）: int num = r.nextInt();
获取一个随机数int数字（参数代表范围，左闭右开）：int num = r.nextInt(3);
实际上代表的可以取到的数字的范围是：[0,3)，也即0~2

 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println(num);

        System.out.println("===========");

        for (int i = 0; i < 10; i++) {
            int num1 = r.nextInt(10);
            System.out.println(num1);
        }

    }
}
