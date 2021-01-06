package com.damahou.demo03;

import java.util.ArrayList;

/*
自定义4个学生对象,添加到集合,并遍历
 */
public class Demo07ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student A = new Student("周润发", 60);
        Student B = new Student("张学友", 56);
        Student C = new Student("刘德华", 58);
        Student D = new Student("黎明", 58);
        list.add(A);
        list.add(B);
        list.add(C);
        list.add(D);
        for (Student student : list) {
            System.out.println(student.getName() + student.getAge());
        }

        System.out.println("==========");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + list.get(i).getAge());
        }
    }
}
