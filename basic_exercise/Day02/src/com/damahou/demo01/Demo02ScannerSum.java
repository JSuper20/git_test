package com.damahou.demo01;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        int sum = getSum();
        System.out.println("和为：" + sum);
        System.out.println("===========");
        int max = getMax();
        System.out.println("最大值为：" + max);
    }
/*
题目：
键盘输入两个int数字，并且求出和值。

思路：
1. 既然需要键盘输入，那么就用Scanner
2. Scanner的三个步骤：导包、创建、使用
3. 需要的是两个数字，所以要调用两次nextInt方法
4. 得到了两个数字，就需要加在一起。
5. 将结果打印输出。
 */

    /**
     * 求和
     *
     * @return
     */
    private static int getSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数");
        int b = scanner.nextInt();
        return a + b;
    }
/*
    思路：
1. 既然是键盘输入，肯定需要用到Scanner
2. Scanner三个步骤：导包、创建、使用nextInt()方法
3. 既然是三个数字，那么调用三次nextInt()方法，得到三个int变量
4. 无法同时判断三个数字谁最大，应该转换成为两个步骤：
    4.1 首先判断前两个当中谁最大，拿到前两个的最大值
    4.2 拿着前两个中的最大值，再和第三个数字比较，得到三个数字当中的最大值
5. 打印最终结果
 */

    /**
     * 键盘输入三个int数字，然后求出其中的最大值。,获取最大值
     *
     * @return
     */
    private static int getMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数");
        int c = scanner.nextInt();
        return a > (b > c ? b : c) ? a : b;
    }
}
