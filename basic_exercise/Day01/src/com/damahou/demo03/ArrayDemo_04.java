package com.damahou.demo03;

/**
 * 数组遍历：对数组中的每一个元素进行逐一、挨个的处理；最简单的处理就是进行打印输出
 */
public class ArrayDemo_04 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 10;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
