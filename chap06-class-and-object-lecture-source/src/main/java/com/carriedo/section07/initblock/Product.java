package com.carriedo.section07.initblock;

import java.util.PrimitiveIterator;

public class Product {
    //1. JVM 기본값
    //2. 명시적 초기화
    //3. 초기화 블록
    //4. 인스턴스 초기화 블록
    //5. static 초기화 블록

    //1. JVM 기본값
    private String name ; //이런식으로 하면 JVM이 손을 안댄다.

    //2. 명시적 초기화
    private int price =2000000;
    private static String brand ="삼송";

    //3. 초기화 블록
    //4. 인스턴스 초기화 블록
    {
        name="sion";
        price =800;
        //brand ="사";
        System.out.println("인스턴스 초기화 블럭 동작함.");
    }

    //3. 초기화 블록
    //5. static 초기화 블록
    static {
        brand ="헬지";
        System.out.println("static 초기화 블럭 동작함.");
    }

    public String getInfo() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand="+ Product.brand +
                '}';
    }


    /** 기본생성자*/
    public Product() {
        System.out.println("기본생성자 동작함");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 생성자 동작함");
    }

}
