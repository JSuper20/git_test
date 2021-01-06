package com.damahou.demo03;

public class ArrayDemo_12 {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 2, 6, 8, 0};
        int max = max(array);
        int min = min(array);
        System.out.println(max);
        System.out.println(min);
    }
    private static int max(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    private static int min(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
