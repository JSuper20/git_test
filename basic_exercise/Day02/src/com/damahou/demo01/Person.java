package com.damahou.demo01;

public class Person {
    private String name;

    public void showName(){
        System.out.println("我叫" + name);
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
