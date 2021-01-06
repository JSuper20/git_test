package com.damahou.demo03;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("刘备");
        list.add("关羽");
        list.add("张飞");
        list.add("诸葛亮");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=========");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
