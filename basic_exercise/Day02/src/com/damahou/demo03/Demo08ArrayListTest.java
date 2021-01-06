package com.damahou.demo03;

import java.util.ArrayList;

/*
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。格式参照 {元素
@元素@元素}。
 */
public class Demo08ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("刘德华");
        list.add("张学友");
        list.add("黎明");
        list.add("周润发");
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print(list.get(i) + "@");
            } else {
                System.out.print(list.get(i));
            }
        }
        System.out.print("}");
    }
}
