package com.damahou.demo04;

/*
局部变量和成员变量
1、定义的位置不同
局部变量：在方法内部或者参数列表上
成员变量：在类中方法外定义。

2、作用域不同
局部变量：只有在方法体内才可以使用，出了方法体就不能再使用了；
成员变量：整个类中都可以使用。

3、默认值不同
局部变量：没有默认值，如果想要使用，必须手动赋值；
成员变量：如果没有赋值，会使用默认值【整型为0，浮点型为0.0，字符型为'/u0000'，布尔型为false，引用类型为null】

4、内存的位置不一样
局部变量：位于栈中
成员变量：位于堆中

5、生命周期不同
局部变量：随着方法进栈而诞生，睡着方法出栈而消失；
成员变量：随着对象创建而诞生，随着对象呗垃圾回收而消失。

 */
public class Demo07VariableDifference {
   String name;

   public void method1(){
       String nickName = "张三";
       System.out.println(nickName);
   }
   public void method2(String param){
       // 在方法调用的时候必定会传递name的值，故这里可以打印使用name的值
       System.out.println(param);
//       System.out.println(nickName);
   }

}
