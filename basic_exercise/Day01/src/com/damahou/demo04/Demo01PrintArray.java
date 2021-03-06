package com.damahou.demo04;

import java.util.Arrays;

/**
 * 面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理每一个细节。
 * 面向对象：当需要实现一个功能的时候，不关系具体的步骤，而是找一个已经具有该功能的人来帮我们做。
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 90};
        // 要求打印该数组，格式为[10, 20 , 30, 40]
        /*
         * 面想过程的实现
         */
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("======");
        /*
        面向对象的实现
         */
        System.out.println(Arrays.toString(array));
    }
}
