package com.pojo;

/**
 * 问题描述：定义people的年龄时，无法阻止不合理的数值被设置进来。
 * 解决方案：用private关键字将需要保护的成员变量进行修饰。
 *
 * 一旦使用了private进行修饰，那么本类当中仍然可以随意访问；
 * 但是，超出本类范围之外就不能再直接访问了。
 *
 * 间接访问private修饰的成员变量，就需要定义一对公共的setter和getter方法
 *
 * 必须叫setXxx或者getXxx命名规则
 * 对于Getter来说，不能有参数，返回值类型和成员变量对应；
 * 对于Setter来说，不能有返回值，参数类型和成员变量对应。
 */

public class People {
    private String name;
    private int age;

    public People() {
        System.out.println("空参构造执行了");
    }
    public People(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("全参构造执行了");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150){
            this.age = age;
        } else {
            System.out.println("年龄设置有误请检查");
        }
    }
}
