package com.pojo;

public class Phone {
    // 品牌
    public String brand;
    // 价格
    public Double price;
    // 颜色
    public String color;

    /**
     * 打电话给xx
     * @param who 人名参数
     */
    public void call(String who){
        System.out.println("打电话给" + who);
    }

    /**
     * 群发短信
     */
    public void sendMsg(){
        System.out.println("群发短信");
    }

}
