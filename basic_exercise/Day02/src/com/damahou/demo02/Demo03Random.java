package com.damahou.demo02;

import java.util.Random;

/*
获取一个[1, n]之间的随机数

思路：
1、定义一个int变量；
2、要使用：Random；三个步骤：导包、创建、使用
3、如果写10，那么就是0~9,然而要的是1~10，故只需要给整体加上1即可
4、打印随机数字。
 */
public class Demo03Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10) + 1;
            System.out.println(num);
        }
    }
}
