package com.damahou.demo02;

/**
 * 使用方法的时候，注意事项：
 *
 * 1、方法应该定义在类当中，但是不能在方法中再定义方法，方法不能嵌套；
 * 2、方法定义之后不会自动执行，如果希望执行，一定要调用方法；单独调用、打印调用、赋值调用；
 * 3、方法定义的前后顺序无所谓；
 * 4、如果方法有返回值，那么必须写上return 返回值；不能没有；
 * 5、return后面的返回值数据，必须和方法的返回值类型，对应起来；
 * 6、对于一个void没有返回值的方法，不能写return后面的返回值，只能写return;
 * 7、对于一个void方法当中的最后一行的return可以省略不写；
 * 8、一个方法当中可以有多个return语句，但是必须保证同时只能有一个会被执行，两个return不能连写。
 */
public class Method_Demo01 {
    public static void main(String[] args) {
        System.out.println(add(2, 5));
        sayHello();
        System.out.println(compile(3, 5));
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static void sayHello(){
        System.out.println("Hello");
        return;
    }

    public static int compile(int x, int y){
        if (x > y){
            return x;
        } else {
            return y;
        }
    }
}
