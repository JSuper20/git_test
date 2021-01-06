package com.damahou.demo02;

import java.util.Random;
import java.util.Scanner;

public class Demo05RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        System.out.println(randomNum);
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入您猜测的数字：");
            Scanner scanner = new Scanner(System.in);
            int guessNum = scanner.nextInt();
            if (randomNum > guessNum) {
                System.out.println("猜小了，请重试");
                if (i == 9){
                    System.out.println("机会已用尽，请重新开始游戏");
                    break;
                }
            } else if (randomNum < guessNum) {
                System.out.println("猜大了，请重试");
                if (i == 9){
                    System.out.println("机会已用尽，请重新开始游戏");
                    break;
                }
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }
            System.out.println("共10次机会还剩" + (9 - i) + "机会");
        }
    }
}
