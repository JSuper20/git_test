package com.damahou.demo03;

/*
数组的长度是不可以发生改变的；
但是ArrayList集合的长度是可以随意变化的。

对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合中的所有元素，全都是统一的什么类型；
注意：泛型只能是引用类型，不能是基本类型。

注意事项：
对于ArrayList集合来说，直接打印未向其中添加任何元素，得到的不是一个地址值，而是内容。
如果内容为空，得到的是空的中括号[]

 */
import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {

        // 从jdk1.7开始，左边写过泛型之后，右边就可以不再写；但是<>必须得有；
        // 但是如果是jdk1.6之前的话，两边的<>都必须要写上。
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("金");
        list.add("木");
        list.add("水");
        list.add("火");
        list.add("土");
        list.add("灶");
        System.out.println(list);
    }
}
