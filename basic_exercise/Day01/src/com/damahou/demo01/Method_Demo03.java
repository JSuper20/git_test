package com.damahou.demo01;

import java.util.Scanner;

public class Method_Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean compare = compare(a, b);
        System.out.println("两个数是否相等：" + compare);

        String x = scanner.next();
        String y = scanner.next();
        boolean compare1 = compare(x, y);
        System.out.println("两个字符串是否相等：" + compare1);
    }


    /**
     * 比较两个整数是否相同
      * @param a 参数1
     * @param b 参数2
     * @return 返回结果
     */
    public static boolean compare(int a, int b){
        return a == b ? true: false;
    }

    public static boolean compare(String a, String b){
        return a.equals(b) == true ? true : false;
    }
}
