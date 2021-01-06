package com.damahou.demo01;

import java.util.Scanner;

public class Method_Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // 调用方法getSum，传递两个整数，这里传递的实际数据又称为实际参数
        // 并接收方法计算后的结果，返回值
        int sum = getSum(a, b);
        System.out.println(sum);
    }

    /**
     * 定义计算两个整数和的方法
     * 返回值类型，计算结果是int
     * 参数：不确定数据求和，定义int参数，参数又称为形式参数
     * @param x
     * @param y
     * @return
     */
    public static int getSum(int x, int y){
        return x + y;
    }
}
