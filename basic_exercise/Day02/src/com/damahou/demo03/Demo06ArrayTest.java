package com.damahou.demo03;

import java.util.ArrayList;
import java.util.Random;

/*
生成6个1~33之间的随机整数,添加到集合,并遍历
 */
public class Demo06ArrayTest {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int randomNum = random.nextInt(33) + 1;
            list.add(randomNum);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
