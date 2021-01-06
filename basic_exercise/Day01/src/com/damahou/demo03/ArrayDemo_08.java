package com.damahou.demo03;

/**
 * 两个数组的内存图分析
 */
public class ArrayDemo_08 {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println(arrayA); // 数组的内存地址哈希值
        System.out.println("==========");
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println(arrayA);
        int[] arrayB = new int[3];
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]); // 10
        System.out.println(arrayB[2]); // 20
        System.out.println(arrayB); // 数组的内存地址哈希值
        System.out.println("==========");
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]); // 100
        System.out.println(arrayB[2]); // 200
        System.out.println(arrayB);
    }
}
