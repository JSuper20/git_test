package com.damahou.demo03;

/**
 * 使用动态数组初始化数组的时候，其中的元素将会自动拥有一个默认值。规则如下：
 * 1、如果是整型（byte，short，int，long），默认为0;
 * 2、如果是浮点型（float，double），默认为0.0;
 * 3、如果是字符型（char），默认为'/u0000';
 * 4、如果是布尔型（boolean），默认为false;
 * 5、如果是引用类型，默认为null.
 *
 * 【注意事项】
 * 静态初始化其实也有默认值的过程，只不过系统自动马上将默认值替换成为了大括号中的具体数值
 */
public class ArrayDemo_06 {
    public static void main(String[] args) {
        // 整型数组
        // byte类型数组
        byte[] arrayA = new byte[4];
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
        System.out.println("===========");
        // short类型数组
        short[] arrayB = new short[4];
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
        System.out.println("===========");
        // int类型数组
        int[] arrayC = new int[5];
        for (int i = 0; i < arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }
        System.out.println("============");
        // longt类型数组
        long[] arrayD = new long[5];
        for (int i = 0; i < arrayD.length; i++) {
            System.out.println(arrayD[i]);
        }
        System.out.println("============");
        // 浮点型
        // float数组
        float[] floatArray = new float[2];
        for (int i = 0; i < floatArray.length; i++) {
            System.out.println(floatArray[i]);
        }
        System.out.println("============");
        // double数组
        double[] doubleArray = new double[1];
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }
        System.out.println("============");
        // 字符型数组
        char[] charArray = new char[2];
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        System.out.println("============");
        // 布尔型数组
        boolean[] booleanArray = new boolean[2];
        for (int i = 0; i < booleanArray.length; i++) {
            System.out.println(booleanArray[i]);
        }
        System.out.println("============");
        // 引用类型的数组
        String[] strArray = new String[2];
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
