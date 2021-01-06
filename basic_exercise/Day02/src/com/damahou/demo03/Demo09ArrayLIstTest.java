package com.damahou.demo03;

import java.util.ArrayList;
import java.util.Random;

/*
定义获取所有偶数元素集合的方法(ArrayList类型作为返回值)
 */
public class Demo09ArrayLIstTest {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(10) + 1;
            list.add(randomNum);
        }
        System.out.println(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        ArrayList<Integer> arrayList = smallArrayList(list);
        System.out.println(arrayList);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

    }

    public static ArrayList<Integer> smallArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> smallArrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                smallArrayList.add(list.get(i));
            }
        }
        return smallArrayList;
    }
}
