package com.damahou.demo01;

import java.util.Scanner;

public class Method_Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = getSum(x);
        System.out.println(sum);
    }

    /**
     * 比较两个整数是否相同
     * @param x 输入的数
     * @return 返回的结果值
     */
    public static int getSum(int x){
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
}
