package com.damahou.demo02;

public class Method_OverloadJudge {
    public static void main(String[] args) {
        judge((byte)12);
        judge((short) 12);
        judge(12);
        judge(12L);
        judge((char) 12);
        judge(12F);
        judge(12.0);
        judge("12");
        judge(false);
    }

    private static void judge(byte a) {
        System.out.println("byte");
    }

    private static void judge(short a) {
        System.out.println("short");
    }

    private static void judge(int a) {
        System.out.println("int");
    }

    private static void judge(long a) {
        System.out.println("long");
    }

    private static void judge(boolean a) {
        System.out.println("boolean");
    }

    private static void judge(char a) {
        System.out.println("char");
    }

    private static void judge(float a) {
        System.out.println("float");
    }

    private static void judge(double a) {
        System.out.println("double");
    }

    private static void judge(String a) {
        System.out.println("String");
    }
}
