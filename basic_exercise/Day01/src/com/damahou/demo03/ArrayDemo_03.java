package com.damahou.demo03;

/**
 * 使用静态初始化数组的时候，格式还可一个省略一下。
 *
 * 标准格式：
 * 数据类型[] 数组名称 = new 数据类型[] {元素1, 元素2, ...}；
 *
 * 省略格式：
 * 数组类型[] 数组名称 = {元素1, 元素2, ...};
 *
 * 注意事项：
 * 1、静态初始化没有直接指定长度，但是仍然会自动推算得到长度；
 * 2、静态初始化标准格式可以拆分为两个步骤；
 * 3、动态初始化也可以拆分为两个步骤；
 * 4、静态初始化一旦使用省略格式，就不能拆分为两个步骤了
 *
 * 使用建议：
 * 如果不确定数组中的具体内容，用动态初始化；否则，已确定了具体的内容，用静态初始化。
 */
public class ArrayDemo_03 {
    public static void main(String[] args) {
        // 静态数组的标准格式
        int[] arrayA = new int[] {1, 3, 5, 7, 9};
        // 拆分为两步
        int[] arrayB;
        arrayB = new int[]{2, 4, 6, 8};

        // 动态数组的标准格式
        String[] arrayC = new String[4];
        // 拆分为两步
        String[] arrayD;
        arrayD = new String[4];

        // 静态初始化的省略格式，不能拆分为两个步骤
        char[] arrayE = {2, 4, 6};
        for (char c : arrayE) {
            System.out.println(c);
        }

    }
}
