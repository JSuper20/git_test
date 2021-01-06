package com.damahou.demo03;

/**
 * 动态初始化（指定长度），在创建数组的时候，直接指定数组当中的数据元素个数；
 * 静态初始化（指定内容），在创建数组的时候，不直接指定数据个数的多少，而是直接将具体的数据内容进行指定。
 * <p>
 * 静态初始化基本格式：
 * 数据类型[] 数组名 = new 数据类型[] {元素1， 元素2，...}
 * <p>
 * 注意事项：
 * 虽然静态初始化没有直接告诉长度，但是根据大括号里面的元素内容，也可以确定数组的长度。
 */
public class ArrayDemo_02 {
    public static void main(String[] args) {

        // 静态初始化基本格式：
        // 数据类型[] 数组名 = new 数据类型[] {元素1, 元素2, ...}
        int[] arrayA = new int[]{1, 2, 3, 4, 5};
        for (int i : arrayA) {
            System.out.println(i);
        }

        // 静态数组的省略格式：
        // 数据类型[] 数组名 = {};
        String[] arrayB = {"张由甲", "何华昊", "蒋超", "刘飞"};
        for (String s : arrayB) {
            System.out.println(s);
        }

    }
}
