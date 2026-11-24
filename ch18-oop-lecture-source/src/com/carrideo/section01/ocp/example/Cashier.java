package com.carrideo.section01.ocp.example;


import java.util.List;

/** 주문 합계를 계산하는 클래스 */
public class Cashier {

    public int total(List<Beverage> beverages){
        int total = 0;
        for(Beverage beverage: beverages){
            total= total+beverage.getPrice();
        }
        return total;
    }
}
