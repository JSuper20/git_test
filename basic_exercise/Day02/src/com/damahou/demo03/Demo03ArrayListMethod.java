package com.damahou.demo03;

/*
 ArrayList中常用的方法：

 public boolean add(E e): 向集合中添加元素；参数的类型和泛型一致；返回值代表添加是否成功；
 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
 对于其他集合来说，add添加动作不一定都是成功的!!!

 public E get(int index): 从集合中获取元素；参数是索引编号，返回值是对应位置的元素；

 public E remove(int index): 从集合中移除元素；参数是索引编号，返回值是被删除掉的元素；

 public int size(): 获取集合的尺寸长度，返回值是集合中包含的元素个数。
 */

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 返回值表示是否添加成功
        boolean a = list.add("金吒");
        boolean b = list.add("木吒");
        boolean c = list.add("哪吒");
        boolean d = list.add("三太子");
        // 返回值表示集合的容量，大小
        int size = list.size();
        System.out.println(size);
        // 返回值表示索引为0，位置上的元素是
        String name = list.get(0);
        System.out.println(name);
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        // 返回值类型表示索引为3，位置上的元素是
        String remove = list.remove(3);
        System.out.println("被移除的元素是：" + remove);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }
}
