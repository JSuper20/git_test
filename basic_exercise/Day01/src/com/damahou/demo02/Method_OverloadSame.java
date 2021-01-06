package com.damahou.demo02;

public class Method_OverloadSame {
    public static void main(String[] args) {
        System.out.println(compile(3, 3));
    }

    /**
     * 比较两个数据是否相等。参数类型分别为两个 byte 类型，两个 short 类型，两个 int 类型，两个 long 类型，并
     * 在 main 方法中进行测试。
     */
    private static boolean compile(byte a, byte b) {
        System.out.println("byte");
        return a == b ? true : false;
    }
    private static boolean compile(short a, short b) {
        System.out.println("short");
        return a == b ? true : false;
    }
    private static boolean compile(int a, int b) {
        System.out.println("int");
        return a == b ? true : false;
    }

    private static boolean compile(long a, long b) {
        System.out.println("long");
        return a == b ? true : false;
    }


}
