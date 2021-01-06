package com.damahou.demo02;

/**
 * 方法的重载：
 * 指的是在同一个类中，允许存在一个以上的同名方法，只要它们的参数列表不同即可，与修饰符合返回值类型无关；
 * 参数列表：个数不同，数据类型不同，顺序不同；与返回值类型无关、与参数名称无关。
 * 重载方法的调用：JVM通过方法的参数列表，调用不同的方法。
 */
public class Method_OverLoad {
    public static void main(String[] args) {
        System.out.println(getSum(2, 3 , 4, 5));
    }

    public static int getSum(int a, int b){
        return a + b;
    }

    public static int getSum(int a, int b, int c){
        return a + b + c;
    }

    public static int getSum(int a, int b, int c, int d){
        return a + b + c + d;
    }
}
