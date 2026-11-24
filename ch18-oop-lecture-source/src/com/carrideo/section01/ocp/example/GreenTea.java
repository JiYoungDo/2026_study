package com.carrideo.section01.ocp.example;

public class GreenTea implements Beverage{
    @Override
    public String getName() {
        return "녹차";
    }

    @Override
    public int getPrice() {
        return 3500;
    }
}
