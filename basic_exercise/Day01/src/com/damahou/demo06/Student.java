package com.damahou.demo06;

/*
构造方法是专门用来创建对象的方法，当我们通过new关键字来创建对象时，其实就是在调用构造方法

格式：
public 类名称(参数类型 参数名称) {
    方法体
}

注意事项：
1、构造方法的名称必须和所在类名称完全一样，大小写也必须一样；
2、构造方法不要写返回值类型，连void也不写；
3、构造方法不能return一个具体的返回值；
4、如果没有编写任何构造方法，那么编译器将会默认补充一个空参构造方法；
5、一旦编写了至少一个构造方法，那么编译器将不再提供空参构造；
6、构造方法也是可以进行重载的。
重载：方法名称相同，参数列表不同。
 */
public class Student {
    // 成员变量
    /***
     * name 姓名
     */
    private String name;
    /**
     * age 年龄
     */
    private int age;

    // 无参构造方法
    public Student() {
        System.out.println("空参构造执行了");
    }
    // 全参构造方法
    public Student(String name, int age) {
        System.out.println("全参构造执行了");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
