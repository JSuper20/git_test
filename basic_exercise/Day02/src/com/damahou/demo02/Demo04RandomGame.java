package com.damahou.demo02;

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        // 一个随机数在1-100之间
        int num = random.nextInt(100) + 1;
        System.out.println(num);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入您猜的数：");
            int input = scanner.nextInt();
            if (num > input){
                System.out.println("猜小了，请重新猜");
            } else if (num < input){
                System.out.println("猜大了，请重新猜");
            } else {
                System.out.println("恭喜你猜对了");
                System.out.println("游戏结束");
                break;
            }
        }

    }
}
