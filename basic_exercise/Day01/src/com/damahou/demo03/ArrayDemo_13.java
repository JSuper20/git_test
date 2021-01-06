package com.damahou.demo03;

public class ArrayDemo_13 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("========");
        /*
        初始化语句：int min = 0, int max = array.length - 1
        条件判断：min > max
        步进表达式：min++, max --
        循环体：用第三个变量进行倒手，交换对称位置的值
         */
        for(int min = 0, max = array.length - 1; min < max; min++, max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
