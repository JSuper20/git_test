package com.damahou.demo03;

import java.util.Arrays;

/**
 * 直接打印数组名称，得到的是数组对应的地址值：内存地址hash值
 * 二进制：0，1
 * 八进制：01234567
 * 十进制：0-9
 * 十六进制：0-9a-f
 *
 * 访问数组元素的格式：数组名称[索引值]
 * 索引值：就是一个int数字，代表数组当中元素的编号。
 * 【注意】索引值从0开始，一直到“数组的长度-1”为止。
 * 如果获取的索引超出了数组定义长度的索引，就会报错【ArrayIndexOutOfBoundsException】
 */
public class ArrayDemo_05 {
    public static void main(String[] args) {
        // 静态数组的标准定义格式
        int[] arrayA = new int[] {2, 6, 4, 8};
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("==========");
        // 直接打印数组名称得到的将是数组的内存地址哈希值
        System.out.println(arrayA);
        // 使用Arrays工具类，使用toString方法可以将数组转化为字符串格式
        System.out.println(Arrays.toString(arrayA));
        // 也可以使用Arrays工具类中的sort排序方法，对数组中的元素进行排序
        Arrays.sort(arrayA);
        System.out.println(Arrays.toString(arrayA));
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }

        // 如果获取的索引超出了数组定义长度的索引，就会报错【ArrayIndexOutOfBoundsException】
        // System.out.println(arrayA[4]);
    }
}
