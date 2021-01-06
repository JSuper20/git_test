package com.damahou.demo03;

/**
 * 数组的索引编号从0开始，一直到数组长度-1为止
 *
 * 如果访问数组元素的时候，索引编号并不存在，那么将会发生数组索引越界异常
 * Array IndexOutOfBoundsException
 */
public class ArrayDemo_10 {
    public static void main(String[] args) {
        int[] array = {1, 3, 6};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        // 访问不存在的索引，会报数组越界异常
        // System.out.println(array[3]);
    }
}
