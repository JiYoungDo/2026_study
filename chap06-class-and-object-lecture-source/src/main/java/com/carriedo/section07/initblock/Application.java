package com.carriedo.section07.initblock;

public class Application {
    public static void main(String[] args) {

        Product product = new Product();
        //System.out.println(product.getInfo()); // 암 것도 안하고 생성하면 JVM이 넣어준다.

        Product product1 = new Product("대륙폰",500000,"샤오미");
        System.out.println(product1.getInfo());


    }
}
