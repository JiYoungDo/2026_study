package com.carrideo.section01.ocp.example;

public class Latte implements Beverage{
    @Override
    public String getName() {
        return "카페라떼";
    }

    @Override
    public int getPrice() {
        return 5000;
    }
}
