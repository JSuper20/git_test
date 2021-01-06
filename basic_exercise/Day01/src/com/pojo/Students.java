package com.pojo;
/*
对于基本类型当中的boolean值，Getter方法一定要写成isXxxx的形式，而setXxx形式不变
 */
public class Students {
    private String name;
    private int age;
    private boolean male;

    public Students() {
    }

    public Students(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
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

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }


}
