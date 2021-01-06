package com.damahou.demo01;

/**
 * 创建对象的标准格式：
 * 类名称 对象名 = new 类名称();
 *
 * 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
 * new 类名称();
 *
 * 【注意事项】
 * 匿名对象只能使用唯一的一次，下次再用的时候，就必须重新创建一个新对象；
 * 使用建议：如果确定一个对象只需要使用唯一的一次，就可以使用匿名对象。
 */
public class Demo03Anonymous {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("高圆圆");
        p.showName();
        System.out.println("========");

        // 匿名变量
        new Person().setName("赵又廷");
        new Person().showName();
    }
}
