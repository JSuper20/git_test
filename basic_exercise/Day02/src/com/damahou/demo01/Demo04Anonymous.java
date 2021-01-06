package com.damahou.demo01;

import java.util.Scanner;

public class Demo04Anonymous {
    public static void main(String[] args) {
        // 普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        // 匿名对象的方式
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("输入的数字是：" + num1);

        // 使用一般方法书写传入参数
        Scanner sc = new Scanner(System.in);
        methodParam(sc);

        // 使用匿名对象来进行传参
        methodParam(new Scanner(System.in));

        // 使用匿名对象来作为返回值

        Scanner scanner = methodReturn();
        int returnParam = scanner.nextInt();
        System.out.println("输入的数是：" + returnParam);

    }

    public static void methodParam(Scanner sc){
        int nextInt = sc.nextInt();
        System.out.println(nextInt);
    }

    public static Scanner methodReturn(){
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}

