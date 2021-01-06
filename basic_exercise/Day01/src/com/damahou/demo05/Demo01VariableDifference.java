package com.damahou.demo05;
/*
局部变量和成员变量

1、定义的位置不同：
局部变量：在方法内部，或者定义在方法上的参数位置上；
成员变量：在类中方法外。

2、作用域不同：
局部变量：只有在方法中才能使用，出了方法就失效了；
成员变量：整个类中都可以使用。

3、默认值不同
局部变量：没有默认值，如果想要使用，必须进行手动赋值，不赋值不能使用；
成员变量：如果没哟赋值，会有默认值，规则和数组一样。
【整型默认值为0，浮点型默认为0.0，字符型默认为'/u0000'，布尔型默认为false，引用类型默认为null】

4、内存的位置不同
局部变量：位于栈内存中
成员变量：位于堆内存中

5、生命周期不同
局部变量：随着方法进栈而诞生，随着方法出栈而消失；
成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失。

 */

public class Demo01VariableDifference {
    String name;

    public void method01 (){
        System.out.println(name);
        String nickName;
        nickName = "zhangSan";
        System.out.println(nickName);
    }

    public void method02(){
        // 超出了局部变量的作用域方位，不能访问到
//        System.out.println(nickName);

        System.out.println(name);
    }
}
