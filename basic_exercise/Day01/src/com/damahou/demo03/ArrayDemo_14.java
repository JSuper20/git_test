package com.damahou.demo03;

/**
 * 数组可以作为方法的参数
 * 当调用方法的时候，向方法的小括号进行传参，传递进去的其实就是数组的地址值。
 */
public class ArrayDemo_14 {
    public static void main(String[] args) {
        int[] arrayA = new int[]{2, 4, 6, 8};
        printArray(arrayA);
        System.out.println("=============");
        int[] reserve = reserve(arrayA);
        printArray(reserve);
    }

    /**
     * 遍历打印数组
     * @param array 数组
     */
    private static void printArray(int[] array){
        System.out.println("printArray中接收到的array的地址值为：" + array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    /**
     * 数组元素的反转
     * @param array 参数数组
     * @return 返回值
     */
    private static int[] reserve(int[] array){
        System.out.println("reserve中接收到array的地址值为：" + array);
        for (int min = 0, max = array.length - 1; min <= max; min++, max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        return array;
    }
}
