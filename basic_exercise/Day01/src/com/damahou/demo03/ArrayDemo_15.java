package com.damahou.demo03;

/**
 * 一个方法可以由0，1，多个参数；但是只能有一个返回值，不能有多个返回值。
 * 如果希望一个方法中产生了多个结果数据进行返回，可以使用一个数组作为返回值类型即可。
 * <p>
 * 任何数据类型都能作为方法的参数类型，或者返回值类型。
 * <p>
 * 数组作为方法的参数，传递进去的其实也是数组的地址值。
 * 数组作为方法的返回值，返回的其实也是数组的地址值。
 */
public class ArrayDemo_15 {
    public static void main(String[] args) {
        int[] array = {3, 6, 9};
        System.out.println(array);
        int[] fun = fun(array);
        System.out.println("最大值为：" + fun[0]);
        System.out.println("总和为：" + fun[1]);
        System.out.println("平均值为：" + fun[2]);
    }

    /**
     * @param array 参数数组
     * @return 返回值
     */
    private static int[] fun(int[] array) {
        System.out.println("fun中接收到的参数是" + array);
        int max = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            sum += array[i];
        }
        int avg = sum / array.length;
        int[] returnArray = {max, sum, avg};
        return returnArray;
    }
}
