package com.damahou.demo01;

public class Method_Demo01 {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
