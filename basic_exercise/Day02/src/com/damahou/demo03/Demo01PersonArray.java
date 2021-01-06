package com.damahou.demo03;

public class Demo01PersonArray {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        System.out.println(array);

        Person one = new Person("迪丽热巴", 26);
        Person two = new Person("古力娜扎", 25);
        Person three = new Person("哪吒", 12);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0].getName() + array[0].getAge());
        System.out.println(array[1].getName() + array[1].getAge());
        System.out.println(array[2].getName() + array[2].getAge());
    }
}
