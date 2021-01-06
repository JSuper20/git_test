package com.damahou.demo03;

/*
如果希望向集合ArrayList中存储基本数据类型的值，则必须使用基本类型对应的"包装类型"

基本类型            包装类型（引用类型，包装类都位于java.lang包下）
byte                Byte
short               Short
int                 Integer【特殊】
long                Long
boolean             Boolean
char                Character【特殊】
float               Float
double              Double

从JDk1.5开始，支持自动拆箱、自动装箱
自动装箱：基本类型 ———> 包装类型
自动拆箱：包装类型 ———> 基本类型
 */
import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        listA.add("ZhangSan");
        listA.add("LiSi");
        // 以下向集合中添加基本类型的数值时会报错，不可以直接往集合中放入基本数据类型的数
        // listA.add(100);
        System.out.println(listA);

        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        listB.add(200);
        listB.add(300);
        int num = listB.get(2);
        System.out.println(num);
        System.out.println(listB);
        for (int i = 0; i < listB.size(); i++) {
            System.out.println(listB.get(i));
        }
    }
}
