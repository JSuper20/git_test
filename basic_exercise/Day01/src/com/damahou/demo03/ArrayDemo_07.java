package com.damahou.demo03;

/**
 * 一个数组的内存图分析
 */
public class ArrayDemo_07 {
    public static void main(String[] args) {
        int[] array = new int[3];
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array); // 数组的内存地址哈希值
        System.out.println("==========");
        array[1] = 10;
        array[2] = 20;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array);
    }
}
